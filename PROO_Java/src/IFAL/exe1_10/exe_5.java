package IFAL.exe1_10;

/*1. Faça um programa que calcule a média dos números digitados pelo usuário. A leitura dos números
será finalizada, se o usuário digitar zero (0).
2. Adapte o programa anterior para calcular e mostrar além da média de todos os números, a média
dos números pares.
3. Adapte o programa anterior de modo a calcular e exibir o maior número lido.
4. Adapte o programa anterior de modo a calcular e exibir o menor número lido (desconsidere o zero
que será usado para encerrar a leitura dos números). */
import java.util.Scanner;
public class exe_5 {
    public static void main (String [] args){
        Scanner scanf = new Scanner (System.in);

        int numero = 1, cont = 0, contp = 0, numt = 0, nump = 0, mav = 0, mev = 100000000;

        while (numero != 0){
            System.out.print("Digite um valor: ");
            numero  = scanf.nextInt();  
            
            numt = numt + numero;
            cont++;
            
            if (numero % 2 == 0){
                nump = nump + numero;
                contp++;
            }

            if (numero > mav && numero != 0){
                mav = numero;
            }

            if (numero < mev && numero != 0){
                mev = numero;
            }

            System.out.printf("O valor da média de %d / %d é: %.2f\n", numt, cont, (float) numt / cont);
            
            System.out.printf("O valor da média dos números pares, de %d / %d, é: %.2f\n\n", nump, contp, (float) nump / contp );
        }
        System.out.println(mav);
        System.out.println(mev);
    }
}