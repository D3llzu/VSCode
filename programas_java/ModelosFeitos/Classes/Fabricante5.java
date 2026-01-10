package IFAL.ModelosFeitos.Classes;

import java.util.Scanner;

public class Fabricante5 {
    public String nome, email, telefone;
    public Endereco5 endereco = new Endereco5();
    
    public void ler2(){
        Scanner leitura = new Scanner(System.in);
        System.out.println(" -- Fabricante: ");
        System.out.println("Nome: ");
        nome = leitura.nextLine();
        System.out.println("Endereco: ");
        endereco.ler();
        System.out.println("Email");
        email = leitura.next();
        System.out.println("Telefone: ");
        telefone = leitura.next();
    }
    
    public void exibir(){
        System.out.println("Fabricante: "+nome+" "+endereco.cep+
                " "+email+" "+telefone);
    }
}