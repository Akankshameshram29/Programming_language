#que-1 . Create a class (2-D vector) and use it to create another class representing a 3-D vector.

class TwoDVector:
    def __init__(self,i,j):
        self.i = i
        self.j=j

    def show(self):
        print(f"vector = {self.i}i + {self.j}j")

class ThreeDVector(TwoDVector):
    def __init__(self,i,j,k):
        self.i = i
        self.j=j
        self.k=k

    def show(self):
        print(f"vector = {self.i}i + {self.j}j + {self.k}k")

a = TwoDVector(int(input("enter i")),int(input("enter j")))
a.show()
b = ThreeDVector(int(input("enter i")),int(input("enter j")),int(input("enter k")))
b.show()


#que-2 Create a class ‘Pets’ from a class ‘Animals’ and further create a class ‘Dog’ from ‘Pets’. Add a method ‘bark’ to class ‘Dog’.

class Animals:
    @staticmethod
    def walk():
        print("I can walk!")


class pets(Animals):
    @staticmethod
    def home():
        print("I stay at home")

class Dog(pets):
    @staticmethod
    def bark():
        print("woof woof!!")

labrador = Dog()
labrador.walk()
labrador.home()
labrador.bark()

#que-3 Create a class ‘Employee’ and add salary and increment properties to it.Write a method ‘salaryAfterIncrement’ method with a @property decorator with a setter which changes the value of increment based on the salary.

class Employee:
    salary = int(input("enter salary:"))
    increment = 20

    @property
    def salaryafterIncrement(self):
        return (self.salary + self.salary*(self.increment/100))

    @salaryafterIncrement.setter
    def salaryafterIncrement(self,salary):
        self.increment = ((salary/self.salary)-1)*100


e = Employee()
print(e.salaryafterIncrement)
print(e.increment)

#que-4 Write a class ‘Complex’ to represent complex numbers, along with overloaded operators ‘+’ and ‘*’ which adds and multiplies them.

class ComplexNum :
    def __init__(self,r,i):
        self.r=r
        self.i=i

    def _add_(self,c2):
        return Complex(self.r + c2.r,self.i + c2.i)

    def _mul_(self,c2):
        real_part = self.r * c2.r - self.i * c2.i 
        imag_part = self.r * c2.i + self.i * c2.r 


c1 = complex(1,2)
c2 = complex(3,4)
print(c1 + c2)
print(c1*c2)


#que-5 Write a class vector representing a vector of n dimensions. Overload the + and * operator which calculates the sum and the dot(.) product of them

class vector:
    def __init__(self,x,y,z):
        self.x=x
        self.y=y
        self.z=z

    def __add__(self,other):
        result = vector(self.x + other.x, self.y + other.y, self.z + other.z)
        return result

    def __mul__(self, other):
        result = self.x * other.x + self.y * other.y + self.z * other.z
        return result

    def __str__(self):
        return f"vector {self.x},{self.y},{self.z}"


v1 = vector(1,2,3)
v2 = vector(4,5,6)
v3 = vector(7,8,9)

print("v1 + v2", v1 + v2)
print("v1 * v2",v1 * v2)
print("v1 + v3",v1 +v3)
print("v1 * v3",v1 * v3)
print("v2 + v3",v2 + v3)
print("v2 * v3",v2 * v3)


#que-6 Write __str__() method to print the vector as follows:7i + 8j +10k

class vector:
    def __init__(self,x,y,z):
        self.x=x
        self.y=y
        self.z=z
    
    def __str__(self):
        return f"vector {self.x}i+{self.y}j+{self.z}k"

v = vector(7, 8 , 10)
print(v)

#que -7 Override the __len__() method on vector of problem 5 to display the dimension of the vector

class vector :
    def __init__(self,l):
        self.l=l

    def __len__(self):
        return len(self.l)

length = vector([1,3,4,5])
print(len(length))