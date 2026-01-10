package IFAL.Classes;
import java.util.Scanner;
public class Atleta{
   String nome, me, genero = "";
   int idade;
   double peso, altura, IMC, PesoIdeal;
   
  public void ler(){
       Scanner scanf = new Scanner (System.in);
       Scanner scanf2 = new Scanner (System.in);
       System.out.print("Qual o nome: ");
       nome = scanf2.nextLine();
       System.out.print("Modalidade esportiva que você está se inscrevendo: ");
       me = scanf2.nextLine();
       System.out.print("Idade do atleta: ");
       idade = scanf.nextInt();
       System.out.print("Gênero do atleta (M/F): ");
       genero = scanf2.nextLine();
       System.out.print("Peso do atleta: ");
       peso = scanf.nextDouble();
       System.out.print("Altura do atleta: ");
       altura = scanf.nextDouble();
  }

   public void exibir(){
       System.out.printf("\n\nNome: %s", nome);
       System.out.printf("\nModalidade Esportiva: %s", me);
       System.out.printf("\nIdade: %d", idade);
       System.out.printf("\nGênero: %s", genero);
       System.out.printf("\nPeso: %.2f", peso);
       System.out.printf("\nAltura: %.2f", altura);
   }
   
   public void calcularIMC(){
       IMC = peso / (altura * altura);
       System.out.printf("\nIMC = %.2f", IMC);
   }
   
   public void calcularPesoIdeal(){
       if (genero.equalsIgnoreCase("M")){
           PesoIdeal = 72.7 * altura - 58;
       }
       else if (genero.equalsIgnoreCase("F")) {
           PesoIdeal = 62.1 * altura - 44.7;
       } else {
           System.out.println("\nERR #23123. Gênero inserido errado. Reinicie o programa");
       }
       System.out.printf("\nPeso Ideal: %.2f", PesoIdeal);
   }
}
