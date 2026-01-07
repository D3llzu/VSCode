'''[#14] Calcule o resto da divisão inteira entre dois números. Utilize apenas as operações de soma e 
subtração para calcular o resultado..'''

dividendo = int(input("Digite o dividendo: "))
divisor = int(input("Digite o divisor: "))

if divisor == 0:
    print("\nERR.")
else:
    resto = dividendo

    while resto >= divisor:
        resto = resto - divisor

    print(f"\nO resto da divisão inteira entre {dividendo} e {divisor} é {resto}.")