'''[#12] Leia um número e verifique se é ou não um número primo. Para fazer essa verificação, calcule o 
resto da divisão do número por 2 e depois por todos os números ímpares até o número lido. Se o resto de 
uma dessas divisões for igual a zero, o número não é primo. Observe que o 0 e 1 não são primos e que 2 é 
o único número primo que é par.'''

numero = int(input("Digite um número para verificar se é primo: "))

is_primo = True

if numero <= 1:
    is_primo = False
elif numero == 2:
    is_primo = True
elif numero % 2 == 0:
    is_primo = False
else:
    for i in range(3, int(numero**0.5) + 1, 2):
        if numero % i == 0:
            is_primo = False
            break

if is_primo:
    print(f"\n{numero} é um número primo.")
else:
    print(f"\n{numero} não é um número primo.")