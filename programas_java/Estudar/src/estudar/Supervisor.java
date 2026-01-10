/*2 - Crie uma classe chamada Supervisor que herda da classe Funcionário, e tem os atributos: nome do setor que supervisiona. O método
calcularAumento deve ser implementado seguindo esta regra:
- o salário tem um aumento de 20%;
- se ele tiver horas extras, cada hora extra trabalhada vale R$ 20,00;*/
import javax.swing.*;
public class Supervisor extends Funcionario{
    private String setor;
    
    public Supervisor(String setor, String nome, Double salario, int xtr_horas){
        super(nome, salario, xtr_horas);
        setor = this.setor;
    }
    
    @Override
    public void calcularAumento(){
        Double calculo = getSalario() + (getSalario() * 0.2);
        if (getXtr_Horas() > 0){
            calculo = calculo + (getXtr_Horas()* 20);
        }
        setSalario(calculo);
    }
    public void exibir(){
        JOptionPane.showInputDialog (null, getSalario());
    }
}/*
public class Supervisor extends Funcionario{
    private String setor;

    public Supervisor(String setor, String nome, float salario, int qextras) {
        super(nome, salario, qextras);
        this.setor = setor;
    }
    
    public void calcularAumento(){
        float calculo = salario + salario*20/100;
        if (getQextras() >0){
            calculo = calculo + getQextras()*20;
        }
        //salario = calculo;
        
        setSalario(calculo);
    }
    
}*/