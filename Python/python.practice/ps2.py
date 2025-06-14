#que-1 program to add two numbers

a= int(input("enter first number"))
b=int(input("enter second number"))

sum = a+b
print("sum =",sum)

#que-2 program to find remainder when a number is divided by z
num = int(input('enter the number'))
z = int(input("enter the divisor"))

remainder = num % z
print("Remainder =",remainder)

#que-3 check the type of variables assinged using input function

variable = input("enter value =")
print(type(variable))

#que -4 Use comparison operator to find out whether ‘a’ given variable a is greater than
#‘b’ or not

a = int(input("a = "))
b = int(input("b = "))

if a>b:
    print("a is greater")
elif b>a:
    print("b is greater")
elif a==b:
    print("a is equal to b")

#que -5 program to find an average of two numbers entered by the user

num1 = int(input("enter first number"))
num2 = int(input("enter second number"))

avg = (num1 + num2 )/ 2
print(avg)

#que - 6 program to calculate the square of a number entered by the user.

n = int(input("enter n"))
square = n * n

print("square of n = ",square)
