"""[#4] Receba uma string e uma lista/matriz. A função deve comparar a string passada com os 
elementos da lista/matriz, também passada como parâmetro. Retorne verdadeiro se a string for 
encontrada dentro da lista/matriz, e falso, caso contrário."""

def encontra_string(string, lista):
    for elemento in lista:
        if string == elemento:
            return True
    return False

string = input("Digite a string a ser buscada: ")

lista = ["INPR", "IFAL", "Flamengo", "Python", "Gardel"]

if encontra_string(string, lista):
    print("\nverdadeiro")
else:
    print("\nfalso")