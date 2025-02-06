"""[#5] Receba duas frases distintas e imprima de maneira invertida, trocando as letras A por *."""

frase1 = (input("Digite uma frase aqui: "))
frase2 = (input("Digite outra frase agora: "))

frase1 = frase1.replace ("a", "*")
frase2 = frase2.replace ("a", "*")

frase1 = frase1[::-1]
frase2 = frase2[::-1]

print = (frase1, frase2)