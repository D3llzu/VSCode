# Recebe as duas frases
frase1 = input("Digite a primeira frase: ")
frase2 = input("Digite a segunda frase: ")

# Função para inverter a frase e substituir 'A' por '*'
def inverter_e_substituir(frase):
    # Inverte a frase
    frase_invertida = frase[::-1]
    # Substitui as letras 'A' por '*'
    frase_modificada = frase_invertida.replace('A', '*').replace('a', '*')
    return frase_modificada

# Aplica a função nas duas frases
frase1_modificada = inverter_e_substituir(frase1)
frase2_modificada = inverter_e_substituir(frase2)

# Imprime as frases modificadas
print("Frase 1 modificada:", frase1_modificada)
print("Frase 2 modificada:", frase2_modificada)