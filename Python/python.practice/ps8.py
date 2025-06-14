#que-1 program using functions to find greatest of three numbers.

def comparison(a,b,c):
    if(a>b and a>c):
        print("a is greater")
        return a
    elif(b>a and b>c):
        print("b is greater")
        return b
    elif(c>a and c>b):
        print("c is greater")
        return c
     



a = int(input("enter first number"))
b =int(input("enter second number"))
c= int(input("enter third number"))

greater_num = comparison(a,b,c)
print("the greater number = ", greater_num)



#que-2 program using function to convert Celsius to Fahrenheit.

temp = int(input("enter temperature in celsius"))

def Fahrenheit(temp):
    temp_fahren = (temp * 9/5)+32
    return temp_fahren

print("temperature in fahrenheit = ", Fahrenheit(temp))



#que-3 How do you prevent a python print() function to print a new line at the end?

sentences1 = input("enter sentence")
sentences2 = input("enter sentence")

print(sentences1,end="")#end="" does not print in next line
print(sentences2)



#que-4 recursive function to calculate the sum of first n natural numbers.

def sum(n):
     if(n==1):
        return 1
     return sum(n-1) + n


n = int(input("enter the number:"))

print("sum:",sum(n))


#que-5 function to print first n lines of the following pattern:
#***
#** 
#*

def pattern(n):
    if(n==0):
        return ""
    print("*"*n)
    pattern(n-1)

n = int(input("enter n "))
pattern(n)


#que-6 function to convert inches to cms

def inch_to_cm(inch):
    length_in_cm = inch * 2.54
    print("length in centimeter",length_in_cm)
    return length_in_cm

inch = int(input("enter inch:"))

inch_to_cm(inch)



#que-7 Write a python function to remove a given word from a list ad strip it at the sametime.


def remove_and_strip(word, input_list):
    
    stripped_list = [item.strip() for item in input_list if item.strip() != word]
    return stripped_list


input_list = ["  apple  ", "banana", "  orange  ", " apple ", "grape"]
word_to_remove = "apple"
result = remove_and_strip(word_to_remove, input_list)
print(result)



#que-8 function to print table of a given number

n = int(input("enter number:"))

def print_table():
    for i in range(1,11):
        print(n*i)

print_table()