/*Faça um programa que transforme o computador numa urna eletrônica para eleição. O usuário poderá 
votar em um dos seguintes candidatos:
30 – Homem Aranha
50 – Mulher Maravilha
60 – Homem de Ferro
Cada voto deve ser dado pelo número do candidato, permitindo-se ainda o voto 00 para voto em branco.
Qualquer voto diferente dos já citados é considerado nulo. No final da eleição o programa deve 
emitir um relatório contendo a votação de cada candidato, a quantidade votos em branco, a quantidade 
de votos nulos.*/
package IFAL;
import java.util.Scanner;

public class exe_1 {
  public static void main (String [] args){
      Scanner scanf = new Scanner (System.in);
      
      System.out.print("Digite um número para votar em um dos 3 candidatos: ");
      int voto = scanf.nextInt();
      
      switch (voto){
          case 30:
              System.out.println("\nVocê votou no Homem-Aranha");
              break;
          case 50:
              System.out.println("\nVocê votou na Mulher-Maravilha");
              break;
          case 60:
              System.out.println("\nVocê votou no Homem de Ferro");
              break;
          case 0:
              System.out.println("\nVocê votou em branco");
              break;
          default:
              System.out.println("\nVocê votou nulo");
              break;
      }
  }  
}
