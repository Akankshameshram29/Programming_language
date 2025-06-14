#Create a class “Programmer” for storing information of few programmers working at Microsoft.


class programmer():
    company = "Microsoft"
    

    def __init__(self,name,language,position,salary):
        self.name = name
        self.language = language
        self.position = position
        self.salary = salary
    

a=programmer(name = input("Enter your name"),
    language = input("language you work on:"),
    position = input("your position in the company"),
    salary = int(input("your salary")))

print(a.salary)


#que-2 Write a class “Calculator” capable of finding square, cube and square root of a number.
#que-4 Add a static method in problem 2, to greet the user with hello.

class Calculator:
    def __init__(self,n):
        self.n = n

    def square(self):
       print(f"square:{self.n*self.n}")
    
    def cube(self):
        print(f"cube:{self.n*self.n*self.n}")

    def squareroot(self):
        print(f"squareroot:{self.n**1/2}")

    @staticmethod
    def hello():
        print("hello there!")

a = Calculator(int(input("enter number")))
a.hello()
a.square()
a.cube()
a.squareroot()


#que-3 Create a class with a class attribute a; create an object from it and set ‘a’ directly using ‘object.a = 0’. Does this change the class attribute?

class Demo():
    a=4

o = Demo()
print(o.a)
o.a=0 # only changes the instance attribute not the class attribute
print(o.a)
print(Demo.a)


#que-5 Write a Class ‘Train’ which has methods to book a ticket, get status (no of seats) and get fare information of train running under Indian Railways.
from random import randint
class Train:
     def __init__(self,trainno):
        self.trainno= trainno

     def book(self, source,destination):
        print(f"ticket is booked in the train no{self.trainno} from{source} to {destination}")
        

     def getstatus(self,):
        print(f"the train no{self.trainno} is running on time")

     def getfare(self, source, destination):
        print(f"ticket fare in train no{self.trainno} from {source} to {destination} is {randint(300,1000)}")

t = Train(12234)
t.book("howrah","nagpur")
t.getfare("howrah","nagpur")
t.getstatus()

