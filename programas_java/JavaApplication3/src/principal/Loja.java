package principal;
import java.util.*;
public class Loja{
    private Scanner scanf = new Scanner (System.in);    
    private ArrayList<Revista> rev = new ArrayList <Revista>();
    private ArrayList<Flor> flor = new ArrayList <Flor>();
    
    public void cadastrarProduto(){
        System.out.println("==CADASTRO=="
                + "\n1 - Revista"
                + "\n2 - Flor"
                + "\nSelecione o número: ");
        int esc = scanf.nextInt();
        if (esc == 1){
            Revista rev2 = new Revista();
            rev.add(rev2);
        }
        else if (esc == 2){
            Flor flor2 = new Flor();
            flor.add(flor2);
        }
    }
    public void exibirProdutosFornecedor(){
        Scanner scanf = new Scanner (System.in);
        System.out.println("Forcenedor a ser procurado: ");
        String fornecedor_proc = scanf.nextLine();
        for (int i = 0; i < rev.size(); i++) {
            if (fornecedor_proc.equalsIgnoreCase(rev.get(i).getFornecedorNome())){
                rev.get(i).exibir();
            }
            else{
                System.out.println("\nESSE FORNECEDOR NÃO ESTÁ CADASTRADO COM NENHUM PRODUTO\n");
            }
        }
        for (int i = 0; i < flor.size(); i++) {
            if (fornecedor_proc.equalsIgnoreCase(flor.get(i).getFornecedorNome())){
                flor.get(i).exibir();
            }
            else{
                System.out.println("\nESSE FORNECEDOR NÃO ESTÁ CADASTRADO COM NENHUM PRODUTO\n");
            }
        }
    }
    
}