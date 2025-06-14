#Test 7.py
#testing transactions with wrong signature
#testing transactions with multiple inputs but only one signature.
import Signatures
import Transactions
if __name__ == "__main__":
  pr1, pu1 = Signatures.generate_keys()
  pr2, pu2 = Signatures.generate_keys()
  pr3, pu3 = Signatures.generate_keys()
  pr4, pu4 = Signatures.generate_keys()
# Regular Transaction 1 input 1 output
  Tx1 = Transactions.Tx()
  Tx1.add_input(pu1, 1)
  Tx1.add_output(pu2, 1)
  Tx1.sign(pr1)
# Regular Transaction 1 input 2 outputs
  Tx2 = Transactions.Tx()
  Tx2.add_input(pu1, 2)
  Tx2.add_output(pu2, 1)
  Tx2.add_output(pu3, 1)
  Tx2.sign(pr1)
# Two input addrs, signed by one.
# Signature of pu3 is missing.
  Tx3 = Transactions.Tx()
  Tx3.add_input(pu3, 1)
  Tx3.add_input(pu4, 0.1)
  Tx3.add_output(pu1, 1.1)
  Tx3.sign(pr4)
# Three input addrs, signed by two
# Signature of pu4 is missing.
  Tx4 = Transactions.Tx()
  Tx4.add_input(pu2, 1)
  Tx4.add_input(pu3, 2)
  Tx4.add_input(pu4, 0.1)
  Tx4.add_output(pu1, 3.1)
  Tx4.sign(pr2)
  Tx4.sign(pr3)
# Wrong signature
  Tx5 = Transactions.Tx()
  Tx5.add_input(pu1, 1)
  Tx5.add_output(pu2, 1)
  Tx5.sign(pr2)
  n=0
  for t in [Tx1, Tx2, Tx3, Tx4, Tx5]:
    n=n+1
    print("")
    print ("Output for transaction", n)
    if t.is_valid():
      print("Success! Tx is valid")
    else:
      print("ERROR! Tx is invalid")