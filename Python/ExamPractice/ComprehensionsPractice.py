# now we will tacle comprehensions in python 
# comprehensions are a way to process data structures in a clean way and do some functions on them

numbers = [1,2,3,4,5,6,7,8,9,10,11,12,13]

paire = [x for x in numbers if x % 2 == 0 ]
impaire = [x for x in numbers if x % 2 != 0 ]
print(paire)
print(impaire)


carrePaire = [x*x for x in numbers if x % 2 == 0 ]
print(carrePaire)


# this dictionnaries comprehensions
dicCarreImpaire = {x : x*x for x in numbers if x % 2 != 0}
print(dicCarreImpaire)


# comprehensions of generators
cubes = (x**3 for x in numbers)
for c in cubes:
    print(c)

cubes = (x**3 for x in numbers if x % 2 == 0)
for c in cubes:
    print(c)


# imbriqued comprehensions
# Exemple : List of multiplication for two lists
produits = [(x, y) for x in range(3) for y in range(2)]
print('cartesian multiplication :', produits)