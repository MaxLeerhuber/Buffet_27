import requests
import random
joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
#joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
numofj = int(input("How many jokes would you like to see? "))
for x in range(0,numofj):
    j = random.randrange(0, 10)
    if (j <= 5):
        joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
        print()
        print("Part 2 joke")
        print()
        print(joke2Part["setup"])
        print(joke2Part["delivery"])
        j = random.randrange(0, 10)
    elif (j > 5):
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
        print()
        print("Part 1 joke")
        print()
        print(joke["joke"])
        j = random.randrange(0, 10)
# Jokes with 1 part just have a joke
# joke["joke"] -> References the String of the joke itself


# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke

