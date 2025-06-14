#que-1 program to create a dictionary of Hindi words with values as their English
#translation. Provide user with an option to look it up!

dict = {
   "akhbar":"newspaper",
   "kalam":"pen"
}

word = input("enter the word")
print("english meaning:", dict[word])

#que-2 program to input eight numbers from the user and display all the unique
#numbers (once).

s = set()
for i in range(0,8):
    num = int(input("Enter number"))
    s.add(num)

print(s)

#que-3 Can we have a set with 18 (int) and '18' (str) as a value in it?

sets = (18,"18")
print(set)
print(type(set[0]))
print(type(set[1]))

#Ans-yes we can have set with 18 as int and 18 as str

#que-4 What will be the length of following set s:
s = set()
s.add(20)
s.add(20.0)
s.add('20')

 # length of s after these operations?

print(s)#length of s is 2


#que-5 s = {} What is the type of 's'?

s = {}
print(type(s))

#que-6 Create an empty dictionary. Allow 4 friends to enter their favorite language as
#value and use key as their names. Assume that the names are unique.

dict = {}

for i in range(0,6):
    name = input("enter your name:")
    language = input("enter your favorite language:")
    dict.update({name: language})

print(dict)

#que-7 Can you change the values inside a list which is contained in set S?

s = {8, 7, 12, "Harry", [1,2]}

#set cannot contain list and set cannot have indexing, so values cannot be changed

