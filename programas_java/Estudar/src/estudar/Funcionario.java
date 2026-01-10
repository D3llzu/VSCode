/*1 - Considere uma empresa que deve gerenciar os dados dos funcionários. Crie uma classe abstrata que representa um funcionário. 
Os dados que devem ser registrados para cada  funcionário são: nome, salário e quantidade de horas extras trabalhadas. A classe 
possui construtor, métodos gets/sets e um método abstrato chamado calcularAumento.

2 - Crie uma classe chamada Supervisor que herda da classe Funcionário, e tem os atributos: nome do setor que supervisiona. O método
calcularAumento deve ser implementado seguindo esta regra:
- o salário tem um aumento de 20%;
- se ele tiver horas extras, cada hora extra trabalhada vale R$ 20,00;

3 - Crie uma classe chamada Vendedor que herda da classe Funcionário, e tem os atributos: valor vendido no mês. O método 
calcularAumento deve ser implementado seguindo esta regra:
- o salário tem um aumento de 10%;
- se ele tiver horas extras, cada hora extra trabalhada vale R$ 20,00;
- ele recebe 2% pelo que foi vendido

4 - Crie uma classe Empresa que possui como atributo um ArrayList de funcionários. Implemente métodos para: cadastro, consulta de 
funcionário por nome, dar aumento a todos os funcionários, dar aumento a um funcionário específico.
package estudar;*/
public abstract class Funcionario{
    private String nome;
    private Double salario;
    private int xtr_horas;
    
    public Funcionario (String nome, Double salario, int xtr_horas){
        nome = this.nome;
        salario = this.salario;
        xtr_horas = this.xtr_horas;
    }
    public abstract void calcularAumento();
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        nome = this.nome;
    }
    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public int getXtr_Horas(){
        return xtr_horas;
    }
    public void setXtr_Horas(int xtr_horas){
        xtr_horas = this.xtr_horas;
    }
}/*

public abstract class Funcionario {
    private String nome;
    protected float salario;
    private int qextras;

    public Funcionario(String nome, float salario, int qextras) {
        this.nome = nome;
        this.salario = salario;
        this.qextras = qextras;
    }
    
    public abstract void calcularAumento();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getQextras() {
        return qextras;
    }

    public void setQextras(int qextras) {
        this.qextras = qextras;
    }
    
    
    
}*/