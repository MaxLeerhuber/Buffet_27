num = int(input("Enter a number: "))
y = 1
equal = 0
for x in range(0, num):
    x = x-x+y
    y = y+1
    equal = equal + x
    print(x , " + " , end="")
    if y == num+1:
        print(" = ", end="")
        print(equal)
