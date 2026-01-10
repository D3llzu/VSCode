package IFAL.ModelosFeitos.Classes;

import java.util.Scanner;

public class Carro_Princ_Carro {
    private String placa;
    private String modelo;
    private float preco;
    
    public Carro_Princ_Carro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o modelo: ");
        modelo = scanner.nextLine();
        System.out.println("Informe a placa: ");
        placa = scanner.next();
        System.out.println("Informe o preco: ");
        preco = scanner.nextFloat();
    }
    
    public Carro_Princ_Carro(String modelo, String placa, float preco){
        System.out.println("Construtor com parametros chamado");
        this.modelo = modelo;
        this.placa = placa;
        this.preco = preco;        
    }
    
    public void exibir(){
        System.out.println("Carro: "+placa+" "+modelo
                +" "+preco);
    }
    
    //obter o preco
    public float getPreco(){
        return preco;
    }
    
    //atualizar o preco
    public void setPreco(float preco){
        if (preco >=50000){
            this.preco = preco;
        }else
            System.out.println("O preco é invalido");
    }
    
    public void setPlaca(String placa){
        if (placa.length() == 7)
            this.placa = placa;
        else
            System.out.println("Placa invalida");
    }
    
    public String getPlaca(){
        return placa;
    }
        
}