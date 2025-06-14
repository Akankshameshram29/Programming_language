#que-1 Write a program to read the text from a given file ‘poems.txt’ and find out
#whether it contains the word ‘twinkle’.


f = open("poem.txt")
content = f.read()
if ("twinkle" in content):
    print("the word twinkle is present in the content")
else:
    print("the word twinkle is not present in the content")

f.close()

'''
que-2 The game() function in a program lets a user play a game and returns the score
as an integer. You need to read a file ‘Hi-score.txt’ which is either blank or
contains the previous Hi-score. You need to write a program to update the Hiscore whenever the game() function breaks the Hi-score.
'''
import random

def game():
    print("you are playing a game..")
    score = random.randint(1,50)
    with open("hiscore.txt") as f:
        hiscore = f.read()
        if(hiscore!=""):
            hiscore = int(hiscore)
        else:
            hiscore==0
    print(f"your score:{score}")
    if (score>hiscore):
        with open("hiscore.txt","w") as f:
            f.write(str(score))
    
    return score


game()



''' que - 3Write a program to generate multiplication tables from 2 to 20 and write it to the
different files. Place these files in a folder for a 13 – year old.
'''

def generateTable(n):
    table=""
    for i in range (0,11):
        table += f"n{n} x {i} = {n*i}\n"

    with open(f"tables/table_{n}.txt","w") as f:
        f.write(table)


for i in range (2,21):
    generateTable(i)

'''que-4 A file contains a word “Donkey” multiple times. You need to write a program
which replace this word with ##### by updating the same file.
'''
word = "Donkey"

with open("file.txt","r") as f:
    content = f.read()

contentnew = content.replace("Donkey","#####")

with open("file.txt", "w") as f:
    f.write(contentnew)


'''que-5 Repeat program 4 for a list of such words to be censored.
'''

words = ["Donkey", "bad",]

with open("file.txt","r") as f:
    content = f.read()

for word in words:
    content = content.replace(word,"#"*len(word))

with open("file.txt", "w") as f:
    f.write(content)


'''
que -6 Write a program to mine a log file and find out whether it contains ‘python.
'''
with open("log.txt") as f:
    content = f.read()

if ("Python " in content):
    print("yes python is present")
else:
    print("python is not present")


'''
que-7 Write a program to find out the line number where python is present from ques 6.
'''

with open("log.txt")as f:
    lines = f.readlines()
lineno = 1
for line in lines:
    if("Python" in line):
        print(f"yes python is present in line no : {lineno}")
        break
    lineno += 1

else:
        print("no, python is not present")

'''
 que - 8 Write a program to make a copy of a text file “this. txt"
'''

with open("this.txt") as f:
    content = f.read()

with open("this_copy.txt","w") as f:
    f.write(content)

'''
que-9 Write a program to find out whether a file is identical & matches the content of
another file
'''

with open("file1.txt") as f:
    content1 = f.read()

with open("file2.txt") as f:
    content2 = f.read


if (content1 == content2):
    print("yes this files are identical")
else:
    print("no these files are not identical")


'''que-10 Write a program to wipe out the content of a file using python.
'''

with open("file1.txt","w") as f:
    f.write("")

'''que-11 Write a python program to rename a file to “renamed_by_ python.txt.
'''
with open("file2.txt") as f:
    content = f.read()

with open("renamed_by_ python.txt", "w") as f:
    f.write(content)