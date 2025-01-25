'''[#10]  Calcule o preço a pagar pelo fornecimento de energia elétrica.
Pergunte a quantidade de kWh consumida e o tipo de instalação: R para residências, I para indústrias e 
C para comércios.
Calcule o preço a pagar de acordo com a tabela a seguir:
Preço por tipo e faixa de consumo
Tipo Faixa (kWh) PreçoResidencial Até 500 - R$ 0,40
Acima de 500            - R$ 0,65
Comercial Até 1000  - R$ 0,55
Acima de 1000          - R$ 0,60
Industrial Até 5000   - R$ 0,55
Acima de 5000          - R$ 0,60'''

kwh = float(input("Quantidade de kWh consumida: "))
tipo = input("Tipo de instalação (R para Residências, C para Comércios, I para Indústrias): "). capitalize

if tipo == "R":
    preco = 0.40 if kwh <= 500 else 0.65
elif tipo == "C":
    preco = 0.55 if kwh <= 1000 else 0.60
elif tipo == "I":
    preco = 0.55 if kwh <= 5000 else 0.60
else:
    print("\nTipo de instalação inválido!")
    preco = 0

if preco != 0 :
    total = kwh * preco
    print(f"\nO preço a pagar pelo consumo de {kwh:.2f} kWh é R${total:.2f}.")