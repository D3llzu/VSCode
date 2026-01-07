"""[#2] Leia uma cadeia de caracteres no formato “DD/MM/AAAA” e copie o dia, mês e ano para 3 
variáveis inteiras. Antes disso, verifique se as barras estão no lugar certo, e se DD, MM e AAAA 
são numéricos."""

Data = input("Indique a data de hoje, usando o formato 'DD/MM/AAAA': ")

if len(Data) >= 6 and Data[2] == "/" and Data[5] == "/":
    DD, MM, AAAA = Data.split("/")
    
    if DD.isdigit() and MM.isdigit() and AAAA.isdigit():
        DD = int(DD)
        MM = int(MM)
        AAAA = int(AAAA)
        
        print("\nDia: ", DD, "\nMês: ", MM, "\nAno: ", AAAA, "\n\nTodos os caracteres são numéricos")
        
    else:
        print("\nERR.")
else:
    print("\nERR.")