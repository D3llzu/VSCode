package IFAL.ModelosFeitos;
import IFAL.ModelosFeitos.Classes.Pessoa_exe_11;
import java.util.Scanner;

public class Princ_Pessoa_exe_11 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Scanner leitura2 = new Scanner(System.in);
        
        Pessoa_exe_11 p = new Pessoa_exe_11();//criando um objeto
        p.cadastrar();
        p.exibir();
       
        
        Pessoa_exe_11 pessoa = new Pessoa_exe_11();//criando um objeto
        pessoa.cadastrar();
        pessoa.exibir();
        
        
        System.out.println("Informe o nome da pessoa que voce deseja atualizar: ");
        String n = leitura2.nextLine();
        if (p.nome.equalsIgnoreCase(n)){
            p.cadastrar();
        }else if (pessoa.nome.equalsIgnoreCase(n)){
            pessoa.cadastrar();
        }else
            System.out.println("Pessoa nao encontrada!");
        
    }
    
}