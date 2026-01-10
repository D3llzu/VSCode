package IFAL.exe11_20;
import IFAL.Classes.Atleta;
import java.util.Scanner;
public class exe_12 {
   public static void main (String args []){
       Scanner scanf = new Scanner (System.in);
       Atleta p = new Atleta ();
       String cont;

       System.out.print("Você deseja fazer um programa para ler as informações de um atleta (S/N)? ");
       cont = scanf.nextLine();
       while (cont.equalsIgnoreCase("S")) {
           p.ler();
           p.exibir();
           p.calcularIMC();
           p.calcularPesoIdeal();
           System.out.print("\n\nDeseja reiniciar o programa (S/N)? ");
           cont = scanf.nextLine();
       }
   }
}
