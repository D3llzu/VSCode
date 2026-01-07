package javaapplication3;
import java.util.*;
public class Banco{
    private Scanner scanf = new Scanner (System.in);
    private String name;
    public ArrayList<ContaBancaria> conta = new ArrayList<>();

    public Banco(){
        System.out.println("===CADASTRAMENTO===");
        System.out.println("Nome do Banco: ");
        name = scanf.nextLine();
        conta.add(new ContaBancaria());
    }
    public void newBanco(){
        conta.add(new ContaBancaria());
    }
    
    public void show(){
        System.out.println("=====LOGIN=====");
        for (int i = 0; i < 100; i++) {
            System.out.println("Nome: " + conta.get(i));
            System.out.println("Número: " + conta.get(i));
        }
    }
    public void showSaldoAcount(){
        System.out.println("==EXIBIR SALDO==");
        System.out.println("Número da conta: ");
        String number2 = scanf.nextLine();
        System.out.println("Senha da conta: ");
        String psswd2 = scanf.nextLine();
        
        ContaBancaria ContaBancaria = null;
        
        for (int i = 0; i < conta.size(); i++){
            if (number2.equalsIgnoreCase(ContaBancaria.getNumber())){
                ContaBancaria = conta.get(i);
                break;
            }
        }
        
        if (ContaBancaria != null && psswd2.equalsIgnoreCase(ContaBancaria.getPsswd()) ){
            System.out.println("Saldo atual da conta: R$" + ContaBancaria.getSaldo());
        }
        else{
            System.out.println("DADOS INCORRETOS OU INEXISTENTES");
        }
    }
    public void sacarAccount(){
        System.out.println("=SACAR DINHEIRO=");
        System.out.println("Número da conta: ");
        String number2 = scanf.nextLine();
        System.out.println("Senha da conta: ");
        String psswd2 = scanf.nextLine();
        
        ContaBancaria ContaBancaria = null;
        
        for (int i = 0; i < conta.size(); i++){
            if (number2.equalsIgnoreCase(ContaBancaria.getNumber())){
                ContaBancaria = conta.get(i);
                break;
            }
        }
        if (ContaBancaria != null && psswd2.equalsIgnoreCase(ContaBancaria.getPsswd())){
            System.out.println("Saldo atual da conta: R$" + ContaBancaria.getSaldo());
            System.out.println("Quanto você deseja sacar (R$)? ");
            Double saque = scanf.nextDouble();
            System.out.println("Você removeu: R$" + saque + " da conta");
            ContaBancaria.setSaldo(ContaBancaria.getSaldo() - saque);
        }
        else{
            System.out.println("DADOS INCORRETOS OU INEXISTENTES");
        }
    }
    public void depositAccount(){
        System.out.println("=DEPOSITAR DINHEIRO=");
        System.out.println("Número da conta: ");
        String number2 = scanf.nextLine();
        System.out.println("Senha da conta: ");
        String psswd2 = scanf.nextLine();
        
        ContaBancaria ContaBancaria = null;
        
        for (int i = 0; i < conta.size(); i++){
            if (number2.equalsIgnoreCase(ContaBancaria.getNumber())){
                ContaBancaria = conta.get(i);
                break;
            }
        }
        
        if (ContaBancaria != null && psswd2.equalsIgnoreCase(ContaBancaria.getPsswd()) ){
            System.out.println("Saldo atual da conta: R$" + ContaBancaria.getSaldo());
            System.out.println("Quanto você deseja depositar (R$)? ");
            Double saque = scanf.nextDouble();
            System.out.println("Você depositou: R$" + saque + " da conta");
            ContaBancaria.setSaldo(ContaBancaria.getSaldo() + saque);
        }
        else{
            System.out.println("DADOS INCORRETOS OU INEXISTENTES");
        }
    }
    public void searchClient(){
        System.out.println("=PROCURAR CLIENTE=");
        System.out.println("Me diga o primeiro nome da pessoa: ");
        String name = scanf.nextLine();
        
        ContaBancaria ContaBancaria = null;
        
        for (int i = 0; i < conta.size(); i++){
            if (name.equalsIgnoreCase(ContaBancaria.getClienteName())){
                ContaBancaria = conta.get(i);
                break;
            }
        }
        if (ContaBancaria != null && name.equalsIgnoreCase(ContaBancaria.getClienteName())){
            System.out.println("Essa pessoa possui uma conta nesse banco");
        }
        else{
            System.out.println("Essa pessoa não possui uma conta nesse banco");
        }
    }
}
