package IFAL.Classes;
import java.util.Scanner;
public class Responsavel_exe_15_16 {
   Scanner scanf = new Scanner (System.in); 
   Scanner scanf2 = new Scanner (System.in);
   String nome, telefone;
   char gen;
   
   public void cadastrar(){
       System.out.print("Nome do responsável: ");
       nome = scanf.nextLine();
       System.out.print("Gênero do responsável (F/M): ");
       gen = scanf.next().charAt(0);
       System.out.print("Telefone do responsável: ");
       telefone = scanf2.nextLine();
   }
   public void exibir(){
       System.out.printf("\nNome do responsável: %s\nGênero do responsável: %s\nTelefone do responsável: %s", nome, gen, telefone);
   }
   public void atualizarTelefone(){
       System.out.print("\n\nVocê deseja atualizar o número de telefone (S/N)? ");
       char cont = scanf.next().charAt(0);
       if (cont == 'S' || cont == 's'){
           System.out.println("Novo número de telefone: ");
           System.out.printf("%s --> ", telefone);
           telefone = scanf2.nextLine();
       }
       else{}
   }
}
