import java.util.Scanner;
public class exe_10{
    public static void main(String[] args) {
        Scanner scanf = new Scanner (System.in);
        String CPF;
        Pessoa pes = new Pessoa();
        Pessoa pes2 = new Pessoa();


        System.out.print("Qual o nome da pessoa 1? ");
        pes.nome = scanf.nextLine();
        System.out.print("Qual o CPF da pessoa 1? ");
        pes.cpf = scanf.nextLine();
        System.out.print("Qual a idade da pessoa 1? ");
        pes.idade = scanf.nextInt();
        System.out.print("Qual a altura da pessoa 1? ");
        pes.altura = scanf.nextFloat();
        System.out.println("\nNome da Pessoa 1: " + pes.nome);
        System.out.println("CPF Pessoa 1: " + pes.cpf);
        System.out.println("Idade da Pessoa 1: " + pes.idade);
        System.out.printf("Altura da Pessoa 1: %.2f", pes.altura);


        System.out.print("\n\nQual o nome da pessoa 2? ");
        pes2.nome = scanf.nextLine();
        pes2.nome = scanf.nextLine();
        System.out.print("Qual o CPF da pessoa 2? ");
        pes2.cpf = scanf.nextLine();
        System.out.print("Qual a idade da pessoa 2? ");
        pes2.idade = scanf.nextInt();
        System.out.print("Qual a altura da pessoa 2? ");
        pes2.altura = scanf.nextFloat();
        System.out.println("\nNome da Pessoa 2: " + pes2.nome);
        System.out.println("CPF Pessoa 2: " + pes2.cpf);
        System.out.println("Idade da Pessoa 2: " + pes2.idade);
        System.out.printf("Altura da Pessoa 2: %.2f", pes2.altura);

        System.out.print("\nDigite o CPF para saber se ela está cadastrada: ");
        CPF = scanf.next();

        if (CPF.equals(pes.cpf) || CPF.equals(pes2.cpf)){
            System.out.println("\nPessoa cadastrada");
        }
        else{
            System.out.println("\nPessoa não cadastrada");
        }
    }
}