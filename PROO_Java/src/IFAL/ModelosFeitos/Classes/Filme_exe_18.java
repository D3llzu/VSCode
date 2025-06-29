package IFAL.ModelosFeitos.Classes;

import java.util.Scanner;

public class Filme_exe_18 {
    private String titulo;
    private String genero;
    private int duracao;
    
    public Filme_exe_18(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o titulo: ");
        titulo = leitura.nextLine();
        System.out.println("Informe o genero: ");
        genero = leitura.nextLine();
        System.out.println("Informe a duracao (em minutos): ");
        duracao = leitura.nextInt();               
        
    public void exibir(){
        System.out.println("Filme: "+titulo+" "+genero+" "+duracao);
    }
   
    public String getTitulo(){
        return titulo;
    }
}