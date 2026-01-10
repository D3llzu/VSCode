/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import javax.swing.*;
public class Funcionario extends Pessoa{
    public Funcionario(String nome, String cpf, String dat_nasc) {
        super(nome, cpf, dat_nasc);
    }

    @Override
    public void Boleto() {
        String sal =JOptionPane.showInputDialog(null, "Valor do boleto de " + super.getNome() + ": R$");
        Double salario = Double.parseDouble(sal);
        salario = (salario * 0.95);
        JOptionPane.showMessageDialog(null, "Por ser funcionário, foi pago: R$" + salario);
    }
    
    
    
}
