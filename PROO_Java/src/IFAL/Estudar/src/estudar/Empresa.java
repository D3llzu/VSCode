import java.util.*;

public class Empresa {
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public void darAumento(){
        for (int i = 0; i<funcionarios.size(); i++){
            funcionarios.get(i).calcularAumento();
        }
    }
    
    public void darAumentoUmFuncionario(){
        
        Scanner leitura2 = new Scanner(System.in);
        System.out.println("Qual o nome do funcionario a ser procurado?");
        String nome = leitura2.nextLine();
        
        for (int i = 0; i<funcionarios.size(); i++){
            if (nome.equalsIgnoreCase(funcionarios.get(i).getNome()))
                funcionarios.get(i).calcularAumento();
        }
    }
    
    //implementar um método para adicionar mais horas a um
    //determinado funcionario
    
    public void consultarPorNome(){
        Scanner leitura2 = new Scanner(System.in);
        System.out.println("Qual o nome do funcionario a ser procurado?");
        String nome = leitura2.nextLine();
        for (int i = 0; i<funcionarios.size(); i++){
            if (nome.equalsIgnoreCase(funcionarios.get(i).getNome())){
                System.out.println("É funcionario da empresa");
            }
        }
    }
    
   public void cadastrar(){
       int opcao;
        Scanner leitura = new Scanner(System.in);

       Scanner leitura2 = new Scanner(System.in);
       do{
            System.out.println("Voce deseja cadastrar "
                    + "1 - Supervisor 2 - Vendedor 0 - Sair");
            opcao = leitura.nextInt();
            if (opcao == 1){
                
                System.out.println("Qual o setor do funcionario?");
                String setor = leitura2.nextLine();
                System.out.println("Qual o nome do funcionario?");
                String nome = leitura2.nextLine();
                float salario = 2000;
                System.out.println("Qual a quantidade de horas extras");
                int qextras = leitura.nextInt();
                
                Supervisor s = new Supervisor(setor, nome, salario, qextras);
                funcionarios.add(s);
                System.out.println("Supervisor adicionado");
            }
            if (opcao ==2){                
                System.out.println("Qual o nome do funcionario?");
                String nome = leitura2.nextLine();
                System.out.println("Qual o valor das vendas do funcionario?");
                float valor = leitura.nextFloat();
                float salario = 2000;
                System.out.println("Qual a quantidade de horas extras");
                int qextras = leitura.nextInt();
                
                Vendedor s = new Vendedor(valor, nome, salario, qextras);
                funcionarios.add(s);
                System.out.println("Vendedor adicionado");
            }
       }while (opcao != 0);
   }
       }
