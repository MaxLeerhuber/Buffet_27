num1 = int(input("Enter a number: "))
operation = input("Enter an operation: ")
num2 = int(input("Enter another number: "))
if operation == "+":
    result = num1 + num2
    print(str(num1) + " + " + str(num2) + " = " + str(result))
elif operation == "-":
    result = num1 - num2
    print(str(num1) + " - " + str(num2) + " = " + str(result))
elif operation == "*":
    result = num1 * num2
    print(str(num1) + " * " + str(num2) + " = " + str(result))
elif operation == "/":
    result = num1 / num2
    print(str(num1) + " / " + str(num2) + " = " + str(result))
else:
    print("Not a valid operation")