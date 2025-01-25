'''[#9] Aprove ou não o empréstimo bancário para compra de uma casa. O programa deve perguntar o valor da 
casa a comprar, o salário e 
a quantidade de anos a pagar o valor da prestação mensal não pode ser superior a 30% do salário. 
Calcule o valor da prestação como sendo o valor da casa a comprar dividido pelo número de meses a pagar.'''

valor_casa = float(input("Qual o valor da casa? "))
salario = float(input("Qual a sua renda mensal? "))
anos = float(input("Qual a quantidade de anos a pagar? "))

prestacao = valor_casa / (anos * 12)

if prestacao > (salario * 0.3) :
    print("Seu empréstimo bancário foi negado pois o valor da prestação ultrapassa 30% do seu salário.")
else:
    print("Seu empréstimo bancário foi aprovado, parabéns!")
