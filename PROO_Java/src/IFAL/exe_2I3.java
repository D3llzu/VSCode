package IFAL;

/*Faça um programa para simular o funcionamento de uma calculadora. O programa deverá perguntar ao
usuário qual a operação desejada (+, -, *, /), os dois valores e exibir o resultado de acordo com a
operação selecionada. O programa deverá permitir que o usuário possa realizar várias operações, caso 
deseje.*/
import java.util.Scanner;
public class exe_2I3 {
    public static void main (String [] args){
    Scanner scanf = new Scanner (System.in);
    
        System.out.print("Digite um valor 'a': ");
        int a = scanf.nextInt();
        
        System.out.print("Digite um valor 'b': ");
        int b = scanf.nextInt();
       
        System.out.print("\nQual operação deseja?");
        System.out.println("\n'1' - Soma");
        System.out.println("'2' - Subtração");
        System.out.println("'3' - Multiplicação");
        System.out.println("'4' - Divisão");
        System.out.println("'5' - Potência");
        System.out.print("'6' - Raiz Quadrada\n");
        
        int oper = scanf.nextInt();
        
        if (oper == 1){
                System.out.printf("\n\nO valor final foi: %d", a + b, "\n");
        }
        else if (oper == 2){
                System.out.printf("\n\nO valor final foi: %d", a - b, "\n");
        }
        else if (oper == 3){
                System.out.printf("\n\nO valor final foi: %d", a * b, "\n");
        }
        else if (oper == 4 && b != 0){
                System.out.printf("\n\nO valor final foi: %.2f", (float) a / b, "\n");
        }
        else if (oper == 4 && b == 0){
                System.out.printf("\n\nErro no Código. Refaça-o\n");
        }
        else if (oper == 5){
            System.out.printf("O valor final foi: %d² = %d; %d³ = %d", a, a * a, b, b * b);
        }
        else if (oper == 6){
            float c = (float) Math.sqrt (a);
            float d = (float) Math.sqrt (b);
            System.out.printf("O valor final foi: √%d = %.2f, √%d = %.2f", a, c, b, d);
        }
        else {
            System.out.printf("Erro no Código. Refaça-o");
        }
    }
}