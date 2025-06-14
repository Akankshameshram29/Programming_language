#que-1 program to find the greatest of four numbers entered by the user.

num1 = int(input("enter first number"))
num2 = int(input("enter second number"))
num3 = int(input("enter third number"))
num4 = int(input("enter fourth number"))

if (num1>num2):
    if(num1>num3):
        if(num1>num4):
            print("num1 is greater")
        else:
            ("num4 is greater")
    elif(num1<num3):
        if(num3>num4):
            print("num3 is greater")
        else:
            print("num4 is greater")
elif(num1<num2):
    if(num2>num3):
        if(num2>num4):
            print("num2 is greater")
        else:
            print("num4 is greater")
    elif(num2<num3):
        if(num3.num4):
            print("num3 is greater")
        else:
            print("num4 is greater")


# que-2 program to find out whether a student has passed or failed if it requires a
#total of 40% and at least 33% in each subject to pass. Assume 3 subjects and
#take marks as an input from the user

Maths = int(input("enter marks of maths:"))
science = int(input("enter marks of science:"))
English = int(input("enter marks of english:"))

total_percentage =(100* (Maths + science+ English))/300

if (total_percentage >= 40 and Maths>33 and science>33 and English>33):
    print("you are passed",total_percentage)
else:
    print("you are failed",total_percentage)

#que-3 A spam comment is defined as a text containing following keywords:
#“Make a lot of money”, “buy now”, “subscribe this”, “click this”. Write a program
#to detect these spams.

p1 =  "Make a lot of money"
p2 = "buy now"
p3 = "subscribe this"
p4 = "click this"

message = input("enter the message")

if((p1 in message)or(p2 in message) or(p3 in message)or (p4 in message)):
    print("spam message detected")
else:
    print("not a spam message")

#que-4 Write a program to find whether a given username contains less than 10
#characters or not.

username = input("enter username")

if(len(username)<=10):
    print("your username contains less than 10 characters\n length:",len(username))
else:
    print("your username contains greater than 10 characters\n length:",len(username))
    

#que-5 Write a program which finds out whether a given name is present in a list or not.

list_name = ["Akanksha","sakshi","Teena","komal","khushbu","Mithali"]

name = input("enter your name")
if(name in list_name):
    print("your name is in the list")
else:
    print("your name is not in the list")
    

#que-6 program to calculate the grade of a student from his marks.

marks = int(input("enter your marks"))

if(91<=marks<=100):
    print("excellent")
elif(81<=marks<=90):
    print("you got 'A' grade")
elif(71<=marks<=80):
    print("you got 'B' grade")
elif(61<=marks<=70):
    print("you got 'c' grade")
elif(50<=marks<=60):
    print("you got 'D' grade")
elif(marks>50):
    print("you failed")
    
#que-7 program to find out whether a given post is talking about word entered by user or not.

post = input("enter your post")
word= input()

if(word in post):
    print("this post is talking about the word ", word)
else:
    print("this post is not talking about the word", word)
