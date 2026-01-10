package javaapplication3;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner (System.in);
        int cont = 0;
        Banco bank = new Banco();
        
        do{
            System.out.println("==DIGITE UMA OPÇÃO==");
            System.out.println("1 - Adicionar outra conta");
            System.out.println("2 - Exibir todas as contas");
            System.out.println("3 - Exibir saldo da conta de um cliente");
            System.out.println("4 - Sacar um valor de uma conta");
            System.out.println("5 - Deposita um valor em uma conta");
            System.out.println("6 - Verificar se uma pessoa tem cadastro");
            System.out.println("7 - Sair");
            cont = scanf.nextInt();

            if (cont == 1){
                bank.newBanco();
            }
            else if (cont == 2){
                for (int i = 0; i < 100; i++) {
                    bank.show();
                }
            }
            else if (cont == 3){
                for (int i = 0; i < 100; i++) {
                    bank.showSaldoAcount();
                }
            }
            else if (cont == 4){
                for (int i = 0; i < 100; i++) {
                    bank.sacarAccount();
                }
            }
            else if (cont == 5){
                for (int i = 0; i < 100; i++) {
                    bank.depositAccount();
                }
            }
            else if (cont == 6){
                for (int i = 0; i < 100; i++) {
                    bank.searchClient();
                }
            }
        } while (cont != 7);        
    }
}