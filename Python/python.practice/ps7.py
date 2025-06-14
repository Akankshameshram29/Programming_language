#que -1 program to print multiplication table of a given number using for loop.

n = int(input("enter the number:"))

for i in range(0,11):
    print(f"{n}*{i} = {n*i}")


#que-2program to greet all the person names stored in a list ‘l’ and which starts
#with S.
l = ["Harry", "Soham", "Sachin", "Rahul"]

for name in l:
    if(name.startswith("S")):
        print(f"Hello{name}")

#que-3 Attempt problem 1 using while loop.

n = int(input("enter the number"))
i = 1

while(i<11):
    print(f"{n}*{i} = {n*i}")
    i += 1

#que-4 program to find whether a given number is prime or not.

n = int(input("enter the number:"))

for i in range(2,n):
    if (n%i == 0):
        print("number is not prime")
        break
else:
    print("number is prime")


#que-5 program to find the sum of first n natural numbers using while loop.

n = int(input("enter the number:"))

i = 0 
sum=0
while(i<=n):
    sum +=i
    i+=1

print("sum=",sum)

#que-6 program to calculate the factorial of a given number using for loop.

n = int(input("enter the number:"))
factorial=1
for i in range(1,n+1):
    factorial = factorial*i

print(f"factorial of {n} is {factorial}")


#que-7 Write a program to print the following star pattern.
#   *
#  ***
# *****

n = int(input("enter n:"))

for i in range(1,n+1):
    print(" " *(n-i), end="" )
    print("*" *(2*i-1), end="" )
    print("")



#que-8 Write a program to print the following star pattern:
#*
#**
#***

n = int(input("enter n:"))


for i in range(1,n+1):
    print("*"*i,end="")
    print("")


#que-9 Write a program to print the following star pattern.
#* * *
#*   *    for n = 3
#* * *

n = int(input("enter n:"))


for i in range(1,n+1):
    if(i==1 or i==n):
        print("*"*n,end="")
    else :
        print("*",end="")
        print(" "*(n-2),end="")
        print("*",end="")
    print("")


#que-10 Write a program to print multiplication table of n using for loops in reversed
#order.
n = int(input("enter number:"))

for i in range(1,11):
    print(f"{n}*{11-i}={n*(11-i)}")