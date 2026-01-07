'''[#7] Pergunte o salário do funcionário e calcule o valor do aumento. Para salários superiores a 
R$ 1.250,00, calcule um aumento de 10%. Para os inferiores ou iguais, de 15%.'''

salario = int(input("Qual o seu salário? "))

if (salario < 1250) :
    salario = salario * 1.15
else:
    salario = salario * 1.10

print("Seu novo salário será de R${:.2f}".format(salario))