"""[#4] Leia um nome completo de pessoa e imprima apenas o nome e sobrenome no formato SOBRENOME/Nome. 
Ex.: Antônio Fernando Silva → SILVA/Antônio"""

Nome = input("Digite o seu nome: ")
SNome = input("Digite seu sobrenome: ")

SNome = SNome.upper()

print("\n", SNome, "/", Nome)