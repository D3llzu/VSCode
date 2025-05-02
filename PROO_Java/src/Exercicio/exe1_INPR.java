/*[#1] Leia três valores numéricos inteiros (representados pelas variáveis A, B e C) e apresente 
como resultado final o valor da soma dos quadrados dos três valores lidos.*/
import java.util.Scanner;
public class exe1_INPR {
    public static void main (String[] args){
        Scanner scanf = new Scanner (System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanf.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = scanf.nextInt();
        System.out.print("Digite o valor de C: ");
        int C = scanf.nextInt();

        System.out.printf("\nA soma de % + %d + %d, é igual à: %d", A, B, C, A + B + C);
    }
}