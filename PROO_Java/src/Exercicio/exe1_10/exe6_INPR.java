/*[#6] Receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.*/
import java.util.Scanner;
public class exe6_INPR {
   public static void main (String [] args){
       Scanner scanf = new Scanner (System.in);


       System.out.print("Digite o valor do salário do funcionário: R$ ");
       double sal = scanf.nextDouble();
       System.out.print("Digite o percentual de aumento que sofreu (%): ");
       int per = scanf.nextInt();


       System.out.printf("\nValor do aumento: %.2f", sal * (per/100));
       System.out.printf("\nNovo salário: %.2f", sal + (sal * (per/100)));
   }
}