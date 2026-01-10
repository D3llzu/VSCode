'''[#6] Leia três números e que imprima o maior e o menor.'''

n1 = float(input("Qual o primeiro número? "))
n2 = float(input("Qual o segundo número? "))
n3 = float(input("Qual o terceiro número? "))

n4 = sorted([n1, n2, n3])

print("O maior número é {:.0f} e o menor número é {:.0f}".format(n4[2],n4[0]))