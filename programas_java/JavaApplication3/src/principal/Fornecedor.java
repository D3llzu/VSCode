package principal;
import java.util.*;
public class Fornecedor{
    Scanner scanf = new Scanner (System.in);
    
    private String nome, telefone, email;
    
    public Fornecedor(){
        System.out.println("Nome do Fornecedor: ");
        nome = scanf.nextLine();
        System.out.println("Telefone do Fornecedor: ");
        telefone = scanf.nextLine();
        System.out.println("E-mail do Fornecedor: ");
        email = scanf.nextLine();
        System.out.println("\n");
    }
    public String getNome(){
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}