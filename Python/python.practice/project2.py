#THE PERFECT GUESS

import random
n = random.randint(1,100)
guesses= 1
a = -1
while(a !=n):
    guesses += 1
    a = int(input('guess the number:'))
    if(a>n):
        print("lower number please")
    elif(a<n):
        print("higher number please")

print(f"you have guessed the number correctly in {guesses} attempt")