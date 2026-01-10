package IFAL.ModelosFeitos.Classes;


import java.util.Scanner;


public class Endereco5{
    public String rua, cep, cidade;
    
    public void ler(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe a rua: ");
        rua = leitura.nextLine();
        System.out.println("Informe o CEP: ");
        cep = leitura.next();
        System.out.println("Informe a cidade");
        cidade = leitura.next();
    }
    
    public  void exibir(){
        System.out.println("Endereco: "+rua+" "+cep);
    }
}