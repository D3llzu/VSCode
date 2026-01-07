'''[#15]  Verifique se um número é palíndromo. Um número é palíndromo se continua o mesmo caso seus 
dígitos sejam invertidos. Exemplos: 454, 10501.'''

a = int(input("Digite um primeiro número: "))
b = int(input("Um segundo: "))
c = int(input("Um terceiro: "))
d = int(input("Um quarto número: "))
e = int(input("E o quinto número: "))

if a == e:
    if b == d:
        print ("\nEsse número é um palíndromo")
        
    else:
        print ("\nEsse número não é palíndromo")
        
else:
    print ("\nEsse número não é um palíndromo")