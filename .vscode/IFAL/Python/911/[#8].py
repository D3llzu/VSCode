'''[#8] Leia dois ńúmeros e que pergunte qual operação você deseja realizar. Você deve poder calcular soma 
(+), subtração (-), multiplicação (*) e divisão (/). Exiba o resultado da operação solicitada.'''

n1 = float(input("Qual o primeiro número que deseja realizar uma operação? "))
n2 = float(input("Qual o segundo número que deseja realizar uma operação? "))


oper = int(input("Qual operação deseja realizar: \n1- Soma(+) \n2- Subtração(-) \n3- Multiplicaçã0(*) \n4- Divisão(/) \n\nResposta: "))
if oper == 1 :
    print("O resultado da operação desejada é de {}.".format(n1+n2))
elif oper == 2:
    print("O resultado da operação desejada é de {}.".format(n1-n2))
elif oper == 3 :
    print("O resultado da operação desejada é de {}.".format(n1*n2))
elif oper == 4 :
    print("O resultado da operação desejada é de {}.".format(n1/n2))
else:
    print("Por favor digite uma operação valida!")