#ROCK, PAPER,SCISSOR GAME

str1 = ("rules:\n 1)stone wins over scissors \n 2)scissor win over paper \n 3) paper wins over stone.")
str2 =("Enter 1 for stone\n Enter 0 for scissors\n Enter -1 for paper ")

print(str1)
print(str2)

user1 = int(input("player1:enter your choice"))
user2 = int(input("player2:enter your choice"))

lis_dict = {1:"stone", 0:"scissors", -1:"paper"}

if user1 not in lis_dict or user2 not in lis_dict:
    print("Invalid input! Please enter 1 for Stone, 0 for Scissors, or -1 for Paper.")
    exit()

player1=lis_dict[user1]
player2=lis_dict[user2]

if((player1=="stone" and player2=="stone") or (player1=="paper" and player2=="paper") or(player1=="scissors" and player2=="scissors")):
    print("Its a tie")
else:
    if(player1 == "stone" and player2 == "paper" ):
        print("player2 win!!")
    elif(player1 == "stone" and player2 == "scissors" ):
         print("player1 win!! ")
    elif(player1 == "paper" and player2 == "stone" ):
        print("player1 win!!")
    elif(player1 == "paper" and player2 == "scissors" ):
        print("player2 win!!")
    elif(player1 == "scissors" and player2 == "paper" ):
        print("player1 win!!")
    elif(player1 == "scissors" and player2 == "stone" ):
        print("player2 win!!")
    else:
        print("something went wrong")
