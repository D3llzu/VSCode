//[1] Pergunte e mostre o nome de uma pessoa

import java.util.Scanner;

public class ex_1 {
    public static void main (String a[]){
        Scanner scanf = new Scanner (System.in);
        String nome;


        System.out.print ("Qual o seu nome? ");
        nome = scanf.next ();

        System.out.println ("Seu nome então é " + nome + ", certo?");
    }
    
}
