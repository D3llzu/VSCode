salario = float(input("Digite o valor de um salário: "))
aumento = float(input("Agora diga o valor, em porcentagem, do aumento para receber: "))

salario2 = (salario * (1 + (aumento / 100)))

print ("\nParabéns! Você recebeu um aumento de", aumento, "%. Agora seu salário é de: R$", salario2);