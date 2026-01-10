package principal;
import java.util.*;
public class Revista extends Infos{
    Scanner scanf = new Scanner(System.in);
    private int periodicidade;
    private Fornecedor forn;
    
    public Revista(){
        System.out.println("Nome da Revista: ");
        nome = scanf.nextLine();
        System.out.println("Preço da Revista: ");
        preco = scanf.nextDouble();
        System.out.println("Periodicidade da Revista (7/15 dias): ");
        periodicidade = scanf.nextInt();
        System.out.println("Dia da Chegada da Revista: ");
        dia_cheg = scanf.nextInt();
        forn = new Fornecedor();
    }
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Periodicidade: " + periodicidade + " dias");
        System.out.println("Dia da Chegada da Revista: Dia " + dia_cheg);
        System.out.println("\n===DADOS DO FORNECEDOR===\n");
        System.out.println("Nome do Fornecedor: "  + super.forn.getNome());
        System.out.println("Telefone do Fornecedor: " + super.forn.getTelefone());
        System.out.println("Email do Fornecedor: " + super.forn.getEmail() + "\n\n");
    }
    public String getFornecedorNome(){
        return forn.getNome();
    }
    
}