package IFAL.ModelosFeitos;
import IFAL.ModelosFeitos.Classes.Carro_Princ_Carro;
import java.util.Scanner;

public class Princ_Carro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        Carro_Princ_Carro c = new Carro_Princ_Carro();
        c.exibir();  
        
        Carro_Princ_Carro c2 = new Carro_Princ_Carro("fiat", "ABC123", 80000);
       
        c2.setPreco(-10);
        c.setPlaca("");
        
        float soma = c.getPreco() + c2.getPreco();
        System.out.println("Soma: "+soma);
        System.out.println("Placa do c2: "+c2.getPlaca());
    }
    
}