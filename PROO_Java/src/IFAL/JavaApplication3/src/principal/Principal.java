package principal;
import java.util.*;
public class Principal{
    public static void main(String[] args) {
        Scanner scanf = new Scanner (System.in);
        Loja loja = new Loja();
        int a = 1;
        
        do {
            System.out.println("===LOJA DE REVISTAS E FLORES===");
            System.out.println("1 - Cadastrar algum produto"
            + "\n2 - Exibir produtos, de determinado fornecedor"
            + "\n\nDigite o número: ");
            int esc = scanf.nextInt();
            if (esc == 1){
                loja.cadastrarProduto();}
            else if (esc == 2){
                loja.exibirProdutosFornecedor();}
        } while (a ==1);
    }
}