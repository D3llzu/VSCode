'''[#3] Leia uma string contendo letras de uma frase inclusive os espaços em branco. Retirar os 
espaços em branco e depois escrever o vetor resultante.'''

frase = input("Escreva uma frase: ")

frase2 = frase.replace(" ", "")

print("\n", frase2)