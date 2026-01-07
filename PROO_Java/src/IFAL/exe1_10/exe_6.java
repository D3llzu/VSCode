package IFAL.exe1_10;

/* 5. Construa um programa em Java que calcule e apresente quanto deve ser pago por um cliente por
uma compra no supermercado. O cliente pode comprar vários produtos. Para cada produto são
lidos: o código do produto, o valor e a quantidade. Após a leitura de todos os produtos, o programa
deverá exibir o valor a pagar e solicitar a forma de pagamento. Caso o cliente informe que o
pagamento será em dinheiro ou PIX, há um desconto de 15% no valor total da conta. */
import java.util.Scanner;
public class exe_6 {
    public static void main (String [] args){
        Scanner scanf = new Scanner (System.in);
        float [] preco = new float [5];
        float precofin = 0;
        int prod, valor, pagamento;
        System.out.println ("Bem-vindo ao nosso supermercado! O que você vai desejar?");

        while (!scanf.next().equalsIgnoreCase("nada")){
            System.out.println("\n1 - Arroz Pilão 1kg");
            System.out.println("2 - Cuzcuz Coringa 500g");
            System.out.println("3 - Feijão Maratá 1 kg");
            System.out.println("4 - Leite em pó Maratá 500g");
            System.out.println("5 - Sal de cozinha Maratá 1kg");
            System.out.println("\n'Digite *nada* para parar de comprar'");
            prod = scanf.nextInt();
            
            switch (prod) {
                case 1: 
                    System.out.println("\n7894212545623 - Arroz Pilão 1kg - R$6,00");
                    System.out.print("Quantas unidades? ");
                    valor = scanf.nextInt();
                    preco [0] = valor * 6;
                    break;

                case 2:
                    System.out.println("\n7892343212343 - Cuzcuz Coringa 500g - R$3,00");
                    System.out.print("Quantas unidades? ");
                    valor = scanf.nextInt();
                    preco [1] = valor * 3;
                    break;

                case 3:
                    System.out.println("\n7893425468764 - Feijão Kicaldo 1kg - R$8,00");
                    System.out.print("Quantas unidades? ");
                    valor = scanf.nextInt();
                    preco [2] = valor * 8;
                    break;

                case 4: 
                    System.out.println("\n7893423543234 - Leite em pó Maratá 500g - R$9,00");
                    System.out.print("Quantas unidades? ");
                    valor = scanf.nextInt();
                    preco [3] = valor * 9;
                    break;

                case 5:
                    System.out.println("\n7893425765232 - Sal de cozinha Maratá 1kg - R$3,00");
                    System.out.print("Quantas unidades? ");
                    valor = scanf.nextInt();
                    preco [4] = valor * 3;
                    break;
            
                default:
                    System.out.println("\nPor favor, insira um valor válido");
                    break;
            }
            precofin = preco [0] + preco [1] + preco [2] + preco [3] + preco [4];
            System.out.println("\n\nObrigado pela compra! Você irá desejar mais algum de nossos produtos?");
            System.out.printf("O total da compra foi: R$%.2f. Você deseja continuar comprando?", precofin);
            System.out.println("\n\n'Digite *sim* pra continuar à comprar'");
            System.out.println("'Digite *pagar* para poder ir para à área de pagamento'");
            

            if (scanf.next().equalsIgnoreCase("pagar")){
                break;
            }
        }
        System.out.println("\n\n\nComo será a forma de pagamento?");
        System.out.println("1 - PIX");
        System.out.println("2 - Espécie");
        System.out.println("3 - Cartão de Crédito/Débito");
        System.out.println("4 - Boleto\n");
        pagamento = scanf.nextInt();

        if (pagamento == 1 || pagamento == 2){
            precofin = precofin * (float ) 0.85;
            System.out.printf("\nParabéns! Você recebeu um desconto de 15 por cento. O valor total dos produtos agora é R$%.2f", (float) precofin);
            System.out.println("\nDeseja finalizar as comprar?");
            if (scanf.next().equalsIgnoreCase("sim")){
                System.out.println("\nObrigado pelas compras! Volte sempre");
            }
            else {
                System.out.println("\nPoxa! Que pena que não finalizou as compras. Mas volte sempre!");
            }
        }
        if (pagamento == 3 || pagamento == 4){
            System.out.println("Deseja finalizar as compras? ");
            if (scanf.next().equalsIgnoreCase("sim")){
                System.out.println("\nObrigado pelas compras! Volte sempre!");
            }
            else {
                System.out.println("\nPoxa! Que pena que não finalizou as compras. Mas volte sempre!");
            }
        }
    }
}