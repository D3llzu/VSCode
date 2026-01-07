"""[#2] Apresente o valor de uma temperatura em graus Celsius e Fahrenheit. A função deve
ler a temperatura em graus Kelvin;"""

def graus_C (temp):
	print (temp - 273.15)
def graus_F (temp):
	print ((temp - 273.15) * 1.8 + 32)
    
temp = float(input("Digite a temperatura (K): "))

print("\nA temperatura em °C é: "), graus_C(temp)
print("A temperatura em F é: "), graus_F(temp)