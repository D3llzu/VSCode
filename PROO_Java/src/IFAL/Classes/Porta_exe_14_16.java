package IFAL.Classes;
import java.util.Scanner;
public class Porta_exe_14_16 {
    Scanner scanf = new Scanner (System.in);
    Scanner scanf2 = new Scanner (System.in);
    boolean estado = false;
    String nome, cor;
    double peso;
    char cont;
    
    public void cadastrar(){
        System.out.print("Nome da pessoa, dona dessa porta: ");
        nome = scanf.nextLine();
        System.out.printf("Cor da porta de %s: ", nome);
        cor = scanf.nextLine();
        System.out.printf("Peso da porta %s de %s: ", cor, nome);
        peso = scanf.nextDouble();
    }
    public void exibir(){
        System.out.printf("\n\nA porta %s de %s, que pesa %.2fkg, está %s", cor, nome, peso, estado? "aberta":"fechada");
    }
    public void abrir(){
        System.out.println("\nDeseja abrir a porta? (S/N) ");
        cont = scanf.next().charAt(0);
        
        if (cont == 'S'){
            estado = true;
        }
        else{}
    }
    public void pintar (){
        System.out.println("Você deseja mudar a cor da sua casa? (S/N) ");
        cont = scanf.next().charAt(0);
        
        if (cont == 'S'){
            System.out.print("\nQue cor você deseja mudar a casa?");
            System.out.printf("\n%s --> ", cor);
            cor = scanf2.nextLine();
        }
        else{}
    }
}