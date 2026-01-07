package principal;
import java.util.*;
public class Flor extends Infos{
    Scanner scanf = new Scanner (System.in);
    
    public Flor(){
        System.out.println("Espécie da Flor: ");
        nome = scanf.nextLine();
        System.out.println("Preço da Flor: ");
        preco = scanf.nextDouble();
        System.out.println("Dia de Chegada: ");
        dia_cheg = scanf.nextInt();
        forn = new Fornecedor();
    }
    public void exibir(){
        System.out.println("Espécie: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Dia da Chegada da Flora: Dia " + dia_cheg);
        System.out.println("\n===DADOS DO FORNECEDOR===\n");
        System.out.println("Nome do Fornecedor: "  + super.forn.getNome());
        System.out.println("Telefone do Fornecedor: " + super.forn.getTelefone());
        System.out.println("Email do Fornecedor: " + super.forn.getEmail() + "\n\n");
    }
    public String getFornecedorNome(){
        return forn.getNome();
    }
}