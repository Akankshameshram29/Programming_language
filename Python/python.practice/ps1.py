#que-print a poem
print('''
Twinkle twinkle little star.
How I wonder what you are.
Up above the world so high.
Like a diamond in the sky.
Twinkle twinkle little star.
How I wonder what you are.

Twinkle twinkle little star.
How I wonder what you are.
Up above the world so high.
Like a diamond in the sky.
Twinkle twinkle little star.
How I wonder what you are.
'''
)

#que-2 print the table of a given number
n = int(input("enter a number"))
for i in range(1,11):
     print (i*n)


#que-3 install a external module and perform a operation of choice

import pyjokes
print(pyjokes.get_joke())



#que-4 Write a python program to print the contents of a directory using the os module.
#Search online for the function which does that.
import os

def print_directory_contents(path):
    try:
        # List all the files and directories in the specified path
        entries = os.listdir(path)
        
        print(f"Contents of the directory '{path}':")
        for entry in entries:
            print(entry)
    except FileNotFoundError:
        print(f"The directory '{path}' does not exist.")
    except PermissionError:
        print(f"Permission denied to access the directory '{path}'.")
    except Exception as e:
        print(f"An error occurred: {e}")

# Replace 'your_directory_path' with the path of the directory you want to print
directory_path = '/home folder'
print_directory_contents(directory_path)


