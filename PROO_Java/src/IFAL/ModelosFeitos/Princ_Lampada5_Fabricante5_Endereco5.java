package IFAL.ModelosFeitos;
import IFAL.ModelosFeitos.Classes.Lampada5;
import java.util.Scanner;

public class Princ_Lampada5_Fabricante5_Endereco5 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
            
        
        Lampada5 l1 = new Lampada5();
                 
        Lampada5 l2 = new Lampada5();
        int lamp=0; 
        System.out.println("--- Lampada 1: ");
        l1.ler();
        System.out.println("--- Lampada 2: ");
        l2.ler();
        
        
        System.out.println("Nome do fabricante da "+
                l1.fabricante.nome);
        
        
        l1.exibirDados();
        l2.exibirDados();
        
        do{
            System.out.println("1 – ligar\n" +
                "2 – desligar\n" +
                "3 – exibir\n" +
                "4 – alterar preço\n" +
                "5 – Exibir quantas lâmpadas são de um "
                    + "determinado fabricante (solicitar o nome do\n" +
                "fabricante)\n" +
                "6 – Exibir o valor total (soma dos preços "
                    + "das lâmpadas)\n "
                + "7 - Exibir a quantidade de lâmpadas "
                    + "cujo Fornecedor é da cidade de "
                    + "Arapiraca\n "
                + "8 - Atualizar o CEP do Fornecedor de uma "
                    + "das lâmpadas (perguntar o valor do "
                    + "novo CEP e de qual lâmpada)\n" +
                "0 - Sair");
            int opcao = leitura.nextInt();
            if (opcao == 0)
                break;
            if (opcao == 1 || opcao == 2 || opcao == 3 ||
                    opcao == 4 || opcao == 8){
                System.out.println("Qual a lampada 1 ou 2");
                lamp = leitura.nextInt();
            }
            switch(opcao){
                case 1:
                    if (lamp == 1){
                        l1.ligar();
                    }
                    if (lamp == 2){
                        l2.ligar();
                    }
                    break;
                case 4:                     
                    if (lamp == 1){
                        l1.alterarPreco();
                    }else
                        l2.alterarPreco();
                    break;
                case 5: 
                    System.out.println("Informe o nome do "
                            + "fabricante: ");
                    String nome = leitura.nextLine();
                    int cont = 0;
                    if (l1.fabricante.nome.equalsIgnoreCase(nome))
                        cont++;
                    if (l2.fabricante.nome.equalsIgnoreCase(nome))
                        cont++;
                    System.out.println("A quantidade é: "+cont);
                    break;
                case 6:
                    float soma = l1.preco + l2.preco;
                    System.out.println("A soma: "+soma);
                    break;
                case 7:
                    int cont7 = 0;
                    if (l1.fabricante.endereco.cidade.equalsIgnoreCase("Arapiraca"))
                        cont7++;
                    if (l2.fabricante.endereco.cidade.equalsIgnoreCase("Arapiraca"))
                        cont7++;
                    System.out.println("A quantidade e: "+cont7);
                    break;
                case 8: 
                    if (lamp == 1){
                        System.out.println("Qual o novo CEP?");
                        l1.fabricante.endereco.cep = leitura.next();
                        System.out.println("CEP atualizado");
                    }else if (lamp == 2){
                        System.out.println("Qual o novo CEP?");
                        l2.fabricante.endereco.cep = leitura.next();
                        System.out.println("CEP atualizado");
                    }
                    break;
            }
        }while(true);
        
        
    }
    
}