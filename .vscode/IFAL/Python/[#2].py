preco = (float(input("Quanto vale a mercatoria? ")))
desconto = (float(input("Qual o valor do desconto, em porcentagem? ")))

preco2 = (preco * (1 - (desconto / 100)))

print ("\nDepois do desconto de", desconto, "%, o preço será de R$", preco2);