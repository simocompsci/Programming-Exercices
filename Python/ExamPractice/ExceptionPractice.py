# exception handling in python

# try:
#     print(2/0)
# except ZeroDivisionError:
#     print("division par zero est impossible")


try:
    num = int(input('Entrez un nombre : '))
    result = 10 / num
    print(result)
except ZeroDivisionError:
    print('Erreur : Division par zéro.')
except ValueError:
    print('Erreur : Veuillez entrer un nombre valide.')



# Exemple : using else and finally
try:
    num = int(input('Entrez un nombre : '))
    result = 10 / num
except ZeroDivisionError:
    print('Erreur : Division par zéro.')
else:
    # else bloc is executed if no exception is matched (basically the right answer)
    print('Résultat :', result)
finally:
    # finally bloc always gets executed
    print('Fin de l\'opération.')



# Raising an error with raise
# we use it when we want to raise a specifique error message
def verifier_age(age):
    if age < 18:
        raise ValueError('L\'âge doit être supérieur ou égal à 18.')
    print('Âge valide.')

# Test
try:
    verifier_age(16)
except ValueError as e:
    print('Erreur :', e)