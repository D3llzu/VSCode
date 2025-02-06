"""[#1] Receba do usuário uma string S, um caractere C, e uma posição P e devolva o ı́ndice da primeira posição da string onde foi encontrado 
o caractere C. A procura deve começar a partir da posição P."""

S = input("Digite a string S: ")
C = input("Digite o caractere C: ")
P = int(input("Digite a posição P: "))

if P < 0 or P >= len(S):
    print("ERR.")
else:
    index = S.find(C, P)
    
    if index != -1:
        print("ERR.")
    else:
        print("ERR.")
