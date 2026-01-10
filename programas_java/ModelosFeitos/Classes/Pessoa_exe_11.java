package IFAL.ModelosFeitos.Classes;
import java.util.Scanner;
public class Pessoa_exe_11 {
    public String nome;
    public int idade;
    public float altura;
    public String cpf;
    
    //método
    public void cadastrar(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        nome = leitura.nextLine();
        System.out.println("Informe a idade: ");
        idade = leitura.nextInt();
        System.out.println("Informe a altura: ");
        altura = leitura.nextFloat();
        System.out.println("Informe o CPF: ");
        cpf = leitura.next();
    }
    
    public void exibir(){
        System.out.println("Pessoa: "+nome+ " "+idade);
        System.out.println(" "+altura+" "+cpf);
    }
    
}