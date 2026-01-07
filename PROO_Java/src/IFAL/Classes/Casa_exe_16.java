package IFAL.Classes;
import IFAL.Classes.Porta_exe_14_16;
import IFAL.Classes.Responsavel_exe_15_16;
import java.util.Scanner;
public class Casa_exe_16 {
    Porta_exe_14_16 porFrente = new Porta_exe_14_16 ();
    Porta_exe_14_16 pordeTras = new Porta_exe_14_16 ();
    Responsavel_exe_15_16 res = new Responsavel_exe_15_16 ();
    Scanner scanf = new Scanner (System.in);
    String cor, numero;
    
    public void cadastrar(){
        System.out.print("Cor da casa: ");
        cor = scanf.nextLine();
        System.out.print("Número da casa: ");
        numero = scanf.nextLine();
    }
    public void portaDaFrente(){
        porFrente.cadastrar();
    }
    public void portaDeFundo(){
        pordeTras.cadastrar();
    }
    public void responsavel(){
        res.cadastrar();
    }
    public void exibir(){
        System.out.printf("Cor da casa: %s\nNúmero da casa: %s", cor, numero);
        porFrente.exibir();
        pordeTras.exibir(); 
        res.exibir();
    }
    public void estaAberta(){
        if (porFrente.estado == true && pordeTras.estado == true){
            System.out.println("Todas as portas da casa estão abertas");
        }
        else{
            System.out.println("Tem alguma porta da casa ainda fechada");
        }
    }
    public void fecharCasa(){
        if (porFrente.estado == true || pordeTras.estado == true){
            System.out.print("Deseja fechar todas as portas da casa (S/N)? ");
            char cont = scanf.next().charAt(0);
            if (cont == 'S' || cont == 's'){
                porFrente.estado = false;
                pordeTras.estado = false;
            }
            else{}
        }
        else{}
    }
    public void consultarResponsavel(){
        res.exibir();
    }    
}