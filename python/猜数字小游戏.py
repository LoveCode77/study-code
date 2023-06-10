number=98
print("game start...")
userGuess=0
i=1
while userGuess!=number:
    userGuess=int(input("please input your guess:"))
    if userGuess==number:
        print("correct")
    elif userGuess>number:
        print("big")
    elif userGuess<number:
        print("small")
        
