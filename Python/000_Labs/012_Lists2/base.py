import random
num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
many = int(input("How many random numbers do you want to generate? "))
x = int(0)
while x < many:
    print(num[random.randrange(10)])
    x += 1