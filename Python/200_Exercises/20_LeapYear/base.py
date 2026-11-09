year = int(input("Enter a year you would like to check: "))
if year % 4 != 0:
    print(str(year) + " is not a leap year.")
elif year % 100 == 0 and year % 400 != 0:
    print(str(year) + " is not a leap year.")
else:
    print(str(year) + " is a leap year.")