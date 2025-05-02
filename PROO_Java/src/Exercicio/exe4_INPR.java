/*[#4] Apresente o valor da conversão em dólar (U$) de um valor lido em real (R$). O algoritmo deve 
solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o usuário. */
import java.util.Scanner;
public class exe4_INPR {
    public static void main (String [] args){
        Scanner scanf = new Scanner (System.in);
        
        System.out.print("Cotação do dólar: ");
        float cotd = scanf.nextFloat();
        System.out.print("Dinheiro disponível: ");
        float reais = scanf.nextFloat();

        System.out.printf("\nSabendo disso, você tem um total de: %.2f$", cotd * reais);
    }
}