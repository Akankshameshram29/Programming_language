#que-1 program to store seven fruits in a list entered by the user.

fruits = []

for i in range(0,7):
    f = input("Enter fruit name")
    fruits.append(f)

print(fruits)

#que-2  program to accept marks of 6 students and display them in a sorted
#manner

marks = []

for i in range(0,6):
    number = input("enter marks here:")
    marks.append(number)

marks.sort()
print(marks)


#que-3 Check that a tuple type cannot be changed in python.

tuple = (1,2,3,4,5,6)

tuple[2]=7



#que - 4  program to sum a list with 4 numbers
 
list = [1,2,3,4,5]

print(sum(list))

#que- 5 program to count the number of zeros in the following tuple:
a = (7, 0, 8, 0, 0, 9)

print(a.count(0))