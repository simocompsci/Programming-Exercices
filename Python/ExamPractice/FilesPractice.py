with open("/home/simocompsci/Downloads/Programming-Exercices/Python/ExamPractice/example.txt" , "r") as file:
    contenu = file.read()
    print("Le contenu du fichier example : \n")
    print(contenu)

with open("/home/simocompsci/Downloads/Programming-Exercices/Python/ExamPractice/example.txt" , "r") as file:
    line = file.readline()
    for i in file:
        print(line.strip())
        

with open("/home/simocompsci/Downloads/Programming-Exercices/Python/ExamPractice/example.txt" , 'a') as file:
    file.write("\n just adding this line to check if everything is working")


with open("/home/simocompsci/Downloads/Programming-Exercices/Python/ExamPractice/example.txt" , "w") as file:
    file.write("man i am loosing my head with this type of education we're getting , i swear i am better of learning alone")