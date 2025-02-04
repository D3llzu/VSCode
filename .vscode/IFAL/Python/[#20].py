"""[#5] Receba duas frases distintas e imprima de maneira invertida, trocando as letras A por *."""

frase1 = (input("Digite uma frase aqui: "))[::-1]
frase2 = (input("Digite outra frase agora: ")[::-1])

frase3 = frase1.replace ("a", "*")
frase4 = frase2.replace ("a", "*")

print = (frase3, frase4)