#que -1  program to display a user entered name followed by Good
#Afternoon using input () function.

name = input("enter the name")
print(f"Good Afternoon {name}")

#que-2 program to fill in a letter template given below with name and date.


letter = '''
Dear <|Name|>,
You are selected!
<|Date|>
'''
print(letter.replace(" <|Name|>","Akanksha ").replace("<|Date|>","21 june"))

#que-3  program to detect double space in a string

string = input("enter your string")

print(string.find("  "))

#que-4 Replace the double space from problem 3 with single spaces
sentence = input("sentences:")
print(sentence.replace("  "," "))

# que -5 program to format the following letter using escape sequence

letter = "Dear Harry,\n \t this python course is nice.\n Thanks!"
print(letter)