package javaapplication4;
import javax.swing.*;
public class Gerente extends Pessoa{
    public Gerente(String nome, String cpf, String dat_nasc){
        super(nome, cpf, dat_nasc);
    }
    @Override
    public void Boleto(){
        String sal = JOptionPane.showInputDialog(null, "Valor do boleto: R$");
        Double salario = Double.parseDouble(sal);
        salario = salario * 0.9;
        JOptionPane.showMessageDialog(null, salario);
    }
}