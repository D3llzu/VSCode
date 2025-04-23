/*4. Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A - azul, P- preto, V - verde e 
C - castanho) e a cor dos cabelos (P -preto, C - Castanho, L - Louro e R - Ruivo) de 10 pessoas e calcule e mostre:
a) A quantidade de pessoas com idade menor ou igual a 18; 
b) A quantidade de pessoas com idade superior a 15 anos e peso inferior a 50 quilos;
c) A quantidade de pessoas ruivas e que não possuem olhos azuis;
d) A quantidade de pessoas com cabelos pretos ou castanhos;
e) A idade média;
f) A média das idades das pessoas com altura inferior a 1,50m*/

package IFAL;
import java.util.Scanner;
public class exe_4 {
    public  static void main (String [] args){
    Scanner scanf = new Scanner (System.in);
    int a = 0, b = 0;
    int [] idade = new int [10], peso = new int [10];
    String [] cabelos = new String [10], olhos = new String [10];
    Float [] altura = new Float [10];
    
    System.out.println("Digite a idade da pessoa 1: ");
    idade [0] = scanf.nextInt();
    if (idade [0] >= 18){
        a++;
        }
    
    System.out.println("Digite o peso da pessoa 1: ");
    peso [0] = scanf.nextInt();
    if (idade [0] > 15 && peso [0] < 50){
        b++;
        }
    
    System.out.println("Digite a cor dos olhos (A, P, V, C) da pessoa 1: ");
    olhos [0] = scanf.nextLine();
    peso [0] = scanf.nextInt();
    if (idade [0] > 15 || peso [0] < 50){
        b++;
        }
    }
}
 