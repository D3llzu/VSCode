package IFAL.ModelosFeitos;
import IFAL.ModelosFeitos.Classes.Atleta_exe_12;
import java.util.Scanner;

public class Princ_Atleta_exe_12 {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        
        Atleta_exe_12 a = new Atleta_exe_12();         
        a.ler();
        
        Atleta_exe_12 b = new Atleta_exe_12();
        b.ler();
               
        do{
            System.out.println("De qual atleta: ");
            String ax = entrada.nextLine();

            System.out.println("1 - Exibir dados do atleta\n" +
    "    2 - IMC do atleta\n" +
    "    3 - Peso ideal\n"
                    + "4 - Sair");

            System.out.println("Informe a opção desejada: ");
            opcao = entrada.nextInt();

            if (ax.equalsIgnoreCase(a.nome)){
                a.menu(opcao);            
            }
            else if (ax.equalsIgnoreCase(b.nome)){
                b.menu(opcao);
            }else
                System.out.println("Atleta nao cadastrado!");

        }while(opcao !=4);
    }
    
}