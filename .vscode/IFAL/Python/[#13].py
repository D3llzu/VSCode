'''[#13] Calcule a raiz quadrada de um número. Utilize o método de Newton para obter um resultado 
aproximado. Sendo n o número a obter a raiz quadrada, considere a base b=2. Calcule p usando a fórmula 
p=(b+(n/b))/2. Agora, calcule o quadrado de p. A cada passo, faça b=p e recalcule p usando a fórmula 
apresentada. Pare quando a diferença absoluta entre n e o quadrado de b for menor que 0,0001.'''

n = float(input("Digite um número para calcular a raiz quadrada: "))

b = 2.0
p = (b + (n / b)) / 2.0

while True:
    quadrado_b = b * b
    diferenca = abs(n - quadrado_b)
    
    if diferenca < 0.0001:
        break
    b = p
    p = (b + (n / b)) / 2.0

print(f"A raiz quadrada aproximada de {n:.4f} é {b:.4f}")