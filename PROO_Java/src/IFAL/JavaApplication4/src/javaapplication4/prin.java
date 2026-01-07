/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Gardel
 */
public class prin {
    public static void main(String[] args) {
        Funcionario fun =  new Funcionario("Gardel", "123", "29");
        Gerente gen = new Gerente ("Silas", "134", "31");
        
        fun.Boleto();
        gen.Boleto();
    }
    
}
