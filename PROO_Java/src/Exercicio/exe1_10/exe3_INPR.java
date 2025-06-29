package Exercicio.exe1_10;

/*[#3] Efetuar o cálculo e apresentar o valor de uma prestação de um bem em atraso, utilizando a 
fórmula PRESTACAO <- VALOR +VALOR * (TAXA/100)*TEMPO_MES */
import java.util.Scanner;
public class exe3_INPR {
    public static void main (String [] args){
        Scanner scanf = new Scanner (System.in);

        System.out.print("Qual o valor do produto que comprou? ");
        float VALOR = scanf.nextFloat();
        System.out.print("Qual foi a taxa do produto? ");
        int TAXA = scanf.nextInt();
        System.out.print("E por quanto meses você está sem pagar? ");
        int TEMPO_MES = scanf.nextInt();

        float PRESTACAO = VALOR + (VALOR * (TAXA / 100) * TEMPO_MES);

        System.out.printf("\nO valor da sua prestação é de : %.2f", PRESTACAO);

        if (PRESTACAO >= 10000){
            System.out.print("\nSe você quiser, é bom nós conversarmos sobre esse valor");
        }
        else{
            System.out.print("\nSeria bom você pagar enquanto tá baixa");
        }
    }
}