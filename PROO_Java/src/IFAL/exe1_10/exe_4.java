package IFAL.exe1_10;

/*
 Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A -
azul, P- preto, V - verde e C - castanho) e a cor dos cabelos (P -preto, 
C - Castanho, L - Louro e R - Ruivo) de 10 pessoas e calcule e mostre:

ok a) A quantidade de pessoas com idade menor ou igual a 18;
ok b) A quantidade de pessoas com idade superior a 15 anos e peso inferior a 50
quilos;
ok c) A quantidade de pessoas ruivas e que não possuem olhos azuis;
ok d) A quantidade de pessoas com cabelos pretos ou castanhos;
ok e) A idade média;
f) A média das idades das pessoas com altura inferior a 1,50m
 */

import java.util.Scanner;
public class exe_4 {     
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, quantA = 0, quantB = 0, quantC = 0, quantD = 0;
        int soma = 0, soma2 = 0, cont = 0;
        float peso, altura, media = 0, media2 = 0;
        char olhos;
        String cabelos;
        
        for (int i = 1; i<=3; i++){
            System.out.println("Pessoa "+i);
            System.out.println("\n Informe a idade: ");
            idade = teclado.nextInt();
            System.out.println("Informe o peso: ");
            peso = teclado.nextFloat();
            System.out.println("Informe a altura: ");
            altura = teclado.nextFloat();
            System.out.println("Informe a cor dos olhos"
                    + "(A - azul, P- preto, V - verde e C - castanho) ");
            olhos = teclado.next().charAt(0);
            System.out.println("Informe a cor dos cabelos "
                    + "(P -preto, C - Castanho, L - Louro e R - Ruivo)");
            cabelos = teclado.next(); 
            
            soma = soma + idade;
            
            if (altura < 1.50){
                soma2 = soma2 + idade;
                cont++;
            }
            
            if (idade <= 18){
                quantA++;//quantA = quantA + 1;
            }
            if (idade>=15 && peso <50){
                quantB++;
            }
            if (cabelos.equalsIgnoreCase("R") && (olhos!='a' || olhos!='A')){
                quantC++;
            }
            if (cabelos.equalsIgnoreCase("P") || cabelos.equalsIgnoreCase("C")){
                quantD++;
            }
            
        }//fim do for
        System.out.println("Quantidade de pessoas com idade menor ou "
                + "igual a 18: "+quantA);
        System.out.println("Quantidade de pessoas com idade superior a 15 "
                + "anos e peso inferior a 50kgs: "+quantB);
        System.out.println("Quantidade de pessoas com cabelos ruivos e "
                + "que nao possuem olhos azuis: "+quantC);
        System.out.println("Quantidade de pessoas com cabelo preto ou "
                + "castanho: "+quantD);
        
        media = soma / 3;
        System.out.println("A idade media: "+media);
        
        if (cont > 0){
            media2 = soma2 / cont;
            System.out.println("A idade media das pessoas com altura "
                + "inferior a 1,50: "+media2);
        }
        
    }
    
}