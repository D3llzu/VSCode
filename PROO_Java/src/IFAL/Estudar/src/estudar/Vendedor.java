public class Vendedor extends Funcionario{
    private float valor;

    public Vendedor(float valor, String nome, float salario, int qextras) {
        super(nome, salario, qextras);
        this.valor = valor;
    }

  
    public void calcularAumento() {
        float calculo = salario + salario*10/100;
        if (getQextras() >0){
            calculo = calculo + getQextras()*20;
        }
        
        calculo = calculo + valor*2/100;
        setSalario(calculo);
    }
    
    
}