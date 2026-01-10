package IFAL.Classes;
import java.util.Scanner;
public class Pessoa {
   public static String nome, cpf;
   public static double altura;
   public static int idade;

   public static void cadastramento(){
       Scanner scanf = new Scanner (System.in);
       System.out.println("\nQual o seu nome: ");
       nome = scanf.nextLine();
       System.out.println("Qual seu CPF: ");
       cpf = scanf.nextLine();
       System.out.println("Qual sua altura: ");
       altura = scanf.nextDouble();
       System.out.println("Qual sua idade: ");
       idade = scanf.nextInt();
   }
}