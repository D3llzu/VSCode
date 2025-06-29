package IFAL.ModelosFeitos.Classes;
import java.util.Scanner;
public class Atleta_exe_12 {    
    public String nome, modalidadeEsportiva;
    public float peso, altura;
    public int idade;
    public char genero;
    
    float calcularPesoIdeal(){
        float pesoIdeal=0;
        if (genero == 'M' || genero == 'm'){
            pesoIdeal = 72.7f * altura - 58;
        }else if (genero == 'F' || genero == 'f'){
            pesoIdeal = 62.1f * altura - 44.7f;
        }else
            System.out.println("Genero invalido!");
        System.out.println("O peso ideal: "+pesoIdeal);
        return pesoIdeal;
    }
    
    public void exibir(){
        System.out.println("Atleta: "+nome+" "+genero+
                " "+modalidadeEsportiva);
    }
    
    public void ler(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o nome do atleta: ");
        nome = leitura.nextLine();
        System.out.println("Informe a modalidade: ");
        modalidadeEsportiva = leitura.nextLine();
        System.out.println("Informe o peso: ");
        peso = leitura.nextFloat();
        System.out.println("Informe a altura: ");
        altura = leitura.nextFloat();
        System.out.println("Informe o genero: ");
        genero = leitura.next().charAt(0);
    }
    
    public void calcularImc(){
        float imc;
        imc = peso / (altura * altura);
        System.out.println("IMC: "+imc);
    }
    
    public void menu(int opcao){
        if (opcao == 1)
            exibir();
        if (opcao == 2)
            calcularImc();
        if (opcao == 3)
            calcularPesoIdeal();
    }
}