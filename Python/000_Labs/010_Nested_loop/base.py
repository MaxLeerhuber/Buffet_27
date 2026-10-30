symbol = input("What symbol would you like to use? (&,-,*)")
width = int(input("How wide do you want your box to be? "))
height = int(input("How tall do you want your box to be?"))
for x in range(0,height):
    print("")
    for x in range(0,width):
        if symbol == "*":
            print("*", end=" ")
        elif symbol == "-":
            print("-", end=" ")
        elif symbol == "&":
            print("&", end=" ")
        else:
            print("Not valid symbol")