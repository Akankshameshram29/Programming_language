#Signatures.py
from cryptography.hazmat.backends import default_backend
from cryptography.hazmat.primitives.asymmetric import rsa
from cryptography.hazmat.primitives import hashes
from cryptography.hazmat.primitives.asymmetric import padding
from cryptography.exceptions import InvalidSignature
# Generation of Private and Public keys using RSA algorithm
def generate_keys():
  private = rsa.generate_private_key(
  public_exponent=65537,
  key_size=2048,
  backend=default_backend()
)
  public = private.public_key()
  return private, public
# Creating a signature
def sign(message, private):
  message = bytes(str(message), 'utf-8')
  sig = private.sign(
   message,
   padding.PSS(
       mgf=padding.MGF1(hashes.SHA256()),
       salt_length=padding.PSS.MAX_LENGTH
   ),
   hashes.SHA256()
)
  return sig
# Verification of Strings
def verify(message, sig, public) :
 message = bytes(str(message), 'utf-8')
 try:
   retval = public.verify(
      sig,
      message,
      padding.PSS(
        mgf=padding.MGF1(hashes.SHA256()),
       salt_length=padding.PSS.MAX_LENGTH
    ),
    hashes.SHA256()
   )
   return True
 except InvalidSignature:
    return False
 except:
    print("Error Executing public_key.verify")
    return False
# Main Function
if __name__ == '__main__' :
   pr, pu = generate_keys()
   print(pr)
   print(pu)
   message = "This is a secret message"
   sig = sign(message, pr)
   print(sig)
   correct = verify(message, sig, pu)
   print(correct)
   if correct:
      print("Success! Good Sig")
   else:
      print("Error! Signature is bad")