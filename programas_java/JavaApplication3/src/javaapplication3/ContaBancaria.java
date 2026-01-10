package javaapplication3;
import java.util.*;
public class ContaBancaria {
    private Scanner scanf = new Scanner (System.in);
    private Scanner scanf2 = new Scanner (System.in);
    private Cliente client;
    private String number;
    private double saldo;
    private String psswd;

    public ContaBancaria(){
        System.out.println("====CLIENTE====");
        client = new Cliente ();
        System.out.println("Número: ");
        number = scanf.nextLine();
        System.out.println("Saldo: ");
        saldo = scanf.nextDouble();
        System.out.println("Senha: ");
        psswd = scanf2.nextLine();
        System.out.println("==CADASTRO REALIZADO==");
    }
    public void exibir() {
        System.out.println("==INFORMAÇÕES==");
        client.exibir();
        System.out.println("Número: " + number);
        System.out.println("Saldo: " + saldo);
        System.out.println("Senha: " + psswd);
    }
    public String getClienteName(){
        return client.getName();
    }
    public String getNumber(){
        return this.number;
    }
    public Double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(Double Saldo){
        Saldo = this.saldo;
    }
    public String getPsswd(){
        return this.psswd;
    }
}