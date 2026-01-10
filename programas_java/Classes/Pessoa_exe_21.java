package IFAL.Classes;
import java.util.Scanner;
public class Pessoa_exe_21 {
    Scanner scanf = new Scanner (System.in);
    Endereco_exe_21 end = new Endereco_exe_21 ();
    private String nome, cpf, nasc;
    
    public Pessoa_exe_21(){
        System.out.println("Nome: ");
        nome = scanf.nextLine();
        System.out.println("CPF: ");
        cpf = scanf.nextLine();
        end.atualizar();
        System.out.println("Data de Nascimento (__/__/____): ");
        nasc = scanf.nextLine();
    }   
    public void exibir(){
        System.out.println("Nome: " + nome +
                "CPF: " + cpf +
                "Endereço: \n   Cidade: " + end.setCidade() +
                "   CEP: " + end.setCep() + 
                "   Rua: " + end.setRua() +
                "   Bairro: " + end.setBairro() +
                "Data de Nascimento: " + nasc
        );
    }
    public void atualizar(){ 
       System.out.println("Nome: ");
       nome = scanf.nextLine();
       System.out.println("CPF: ");
       cpf = scanf.nextLine();
       Endereco_exe_21 end = new Endereco_exe_21 ();
       System.out.println("Data de Nascimento (__/__/____): ");
       nasc = scanf.nextLine();
    }
}