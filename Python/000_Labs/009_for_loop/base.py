
length = int(input("How long do you want your line to be? "))
which = input("Do you want it to be horizontal or vertical? ")

for x in range(0,length):
    if which == "Horizontal" or which == "horizontal":
        print("*")
    elif which == "Vertical" or which == "vertical":
        print("*", end=" ")