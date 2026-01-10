package javaapplication3;
import java.util.*;
public class Cliente{
    Scanner scanf = new Scanner (System.in);
    private String name;
    private String CPF;


    public Cliente(){
        System.out.println("Nome: ");
        name = scanf.nextLine();
        System.out.println("CPF: ");
        CPF = scanf.nextLine();
    }
    public void exibir(){
        System.out.println("Nome: " + name);
        System.out.println("CPF: " + CPF);
    }
    public String getName(){
        return this.name;
    }
    public String getCPF(){
        return this.CPF;
    }
}       