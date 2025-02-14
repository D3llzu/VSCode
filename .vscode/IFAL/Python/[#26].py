"""[#1] Calcule e apresente o valor de uma prestação em atraso. Utilize a fórmula
PREST = VALOR + (VALOR * (TAXA/100) * TEMPO);"""

def prest (VALOR, TAXA, TEMPO):
	print(VALOR + (VALOR * (TAXA/100) * TEMPO))
    
valor = int(input("Digite qual o valor pego: "))
taxa = int(input("Qual o valor da taxa para a prestação? "))
tempo = int(input("Tem quanto tempo que pegou a prestação? "))

print(f"\nO valor final da prestação foi: ")

prest(valor, taxa, tempo)