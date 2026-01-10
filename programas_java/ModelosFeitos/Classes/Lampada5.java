package IFAL.ModelosFeitos.Classes;

import java.util.Scanner;

public class Lampada5 {
    public Fabricante5 fabricante = new Fabricante5();    
    public float preco;
    public boolean estado;
    public String potencia;
    Scanner entrada = new Scanner(System.in);
   
    public  void ler(){  
        //fabricante = new Fabricante();
        fabricante.ler2();
        System.out.println("Informe o preco: ");
        preco = entrada.nextFloat();
        System.out.println("Informe a potencia: ");
        potencia = entrada.next();
        estado = false;
    
    }
    public  void exibirDados(){
        System.out.println(fabricante.nome+" "+preco+
                " "+potencia+" "+estado);
        fabricante.exibir();
    }
    
    public void ligar(){
        if (estado == true){
            System.out.println("A lampada já está ligada");
        }else{
            estado = true;
            System.out.println("Lampada ligada");
        }
    }
    
    public void desligar(){
        if (estado == false){
            System.out.println("A lampada já está desligada!");
        }else{
            estado = false;
            System.out.println("Lampada desligada");
        }
    }
    
    public void alterarPreco(){
        System.out.println("Informe o valor do reajuste: ");
        float valor = entrada.nextFloat();
        System.out.println("Informe se é para acrescentar + "
                + "ou dimunuir - ");
        char a = entrada.next().charAt(0);
        if (a=='+')
            preco = preco + valor;
        else
            preco = preco - valor;
    }
}