"""[#3] Apresente o somatório dos N primeiros números inteiros, definidos pelo usuário 
(1+2+3+4+5+6+7+...+N);"""

def somatorio(n):
    soma = 0
    for i in range(1, n + 1):
        soma += i
    return soma

n = int(input("Digite o valor de N: "))

print(f"O somatório de", n, "números é:", somatorio(n))