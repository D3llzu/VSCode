'''[#11] Exiba uma lista de opções (menu): adição, subtração, divisão, multiplicação e sair. Imprima a 
tabuada da operação escolhida. Repita até a opção saída seja escolhida.'''

def main():
    while True:
        print("\nEscolha uma operação:")
        print("1 - Adição")
        print("2 - Subtração")
        print("3 - Multiplicação")
        print("4 - Divisão")
        print("5 - Sair")
        
        opcao = int(input("Digite sua opção: "))
        
        if opcao == 5:
            break
        
        if opcao >= 1 and opcao <= 4:
            numero = float(input("\nDigite um número para a tabuada: "))

            for i in range(1, 11):
                if opcao == 1:
                    print(f"{numero} + {i} = {numero + i:.0f}")
                elif opcao == 2:
                    print(f"{numero} - {i} = {numero - i:.0f}")
                elif opcao == 3:
                    print(f"{numero} * {i} = {numero * i:.0f}")
                elif opcao == 4:
                    if i != 0:
                        print(f"{numero} / {i} = {numero / i:.2f}")
                    else:
                        print("Divisão por zero não é permitida.")
        else:
            print("\nERR.\n\n")

if __name__ == "__main__":
    main()