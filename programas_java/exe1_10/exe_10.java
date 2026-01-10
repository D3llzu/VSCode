package IFAL.exe1_10;
import IFAL.Classes.Pessoa;
import java.util.Scanner;
public class exe_10 {
   public static void main(String[] args) {
       Scanner scanf = new Scanner(System.in);
       Scanner scanf2 = new Scanner(System.in);
       Pessoa p = new Pessoa();
       Pessoa p2 = new Pessoa();
       int se = 1;

       while (se == 1) {
           p.cadastramento();
           System.out.printf("Informações do usuário: \n%s \n%s \n%.2f \n%d", p.nome, p.cpf, p.altura, p.idade);
           p2.cadastramento();
           System.out.printf("Informações do usuário: \n%s \n%s \n%.2f \n%d", p2.nome, p2.cpf, p2.altura, p2.idade);

           System.out.println("\nDigite o nome da pessoa que você deseja editar: ");
           String nome = scanf2.nextLine();

           if (p.nome.equalsIgnoreCase(nome)) {
               p.cadastramento();
           } else if (p2.nome.equalsIgnoreCase(nome)) {
               System.out.println("Qual o seu nome: ");
               p2.cadastramento();
           }
           System.out.println("1 - Continuar\n=! - Parar");
           se = scanf.nextInt();
       }
       System.out.printf("\nInformações do usuário: \n%s \n%s \n%.2f \n%d\n", p.nome, p.cpf, p.altura, p.idade);
       System.out.printf("\nInformações do usuário: \n%s \n%s \n%.2f \n%d\n", p2.nome, p2.cpf, p2.altura, p2.idade);
   }
}