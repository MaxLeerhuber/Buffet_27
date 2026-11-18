import requests

pokemonname = input("Enter the name of a Pokemon you want to learn about: ")
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/" + pokemonname).json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

print("5 fun facts about " + pokemonname + ":")
print("This the pokemons id: " + str(pokemon['id']))
print("This is the pokemons height: " + str(pokemon['height']))
print("This is the pokemons weight: " + str(pokemon['weight']))
print("This is the pokemons first ability: " + str(pokemon['abilities'][0]['ability']['name']))
print("This is the pokemons first type: " + str(pokemon['types'][0]['type']['name']))
