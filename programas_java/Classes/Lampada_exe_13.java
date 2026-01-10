package IFAL.Classes;
import java.util.Scanner;
public class Lampada_exe_13 {
   String Fabricante;
   boolean estado;
   double preco, potencia;

   public void ler(){
       Scanner scanf = new Scanner (System.in);
       System.out.print("O nome do fabricante da lâmpada: ");
       Fabricante = scanf.nextLine();
       System.out.print("O preço da lâmpada (R$): ");
       preco = scanf.nextDouble();
       System.out.print("A pôtencia da lâmpada (W): ");
       potencia = scanf.nextDouble();
       System.out.print("A lâmpada se encontra ligada (true/false)? ");
       estado = scanf.nextBoolean();
   }

   public void ligar(){
       Scanner scanf = new Scanner (System.in);
       System.out.print("\n\nVocê deseja alterar o estado de energia da lâmpada (sim)? ");
       String lgr = scanf.nextLine();

       if (lgr.equalsIgnoreCase("sim")){
           estado = true;
           exibirDados();
       }
       else{}
   }
   
   public void desligar(){
       Scanner scanf = new Scanner (System.in);
       System.out.print("\n\nVocê deseja alterar o estado de energia da lâmpada (não)? ");
       String dlgs = scanf.nextLine();
       
       if (dlgs.equalsIgnoreCase("não")){
           estado = false;
           exibirDados();
       }
       else{}
   }

   public void exibirDados(){
       System.out.printf("\nFabricante: %s", Fabricante);
       System.out.printf("\nPreço atual: R$%.2f", preco);
       System.out.printf("\nPotência: %.0f W", potencia);
       System.out.printf("\nEstado de energia da lâmpada: %s", estado?"Ligada":"Desligada");
   }

   public void alterarPreco(){
       Scanner scanf = new Scanner (System.in), scanf2 = new Scanner (System.in);
       System.out.print("\n\nVocê deseja reajustar o preço da lâmpada (sim/não)? ");
       String cont = scanf.nextLine();
       if (cont.equalsIgnoreCase("sim")){
           System.out.printf("Qual o valor do reajuste de preço (R$): ");
           double reajuste = scanf.nextDouble();
           System.out.print("Esse valor é para somar ou subtrair do valor atual (somar/subtrair)? ");
           String valor = scanf2.nextLine();
           if (valor.equalsIgnoreCase("somar")){
               preco = preco + reajuste;
               exibirDados();
           }
           else if (valor.equalsIgnoreCase("subtrair")){
               preco = preco - reajuste;
               exibirDados();
           }
           else{
               System.out.print("\n\nERR. #31E3.d2. Reinicie o programa");
           }
       }
   }
}