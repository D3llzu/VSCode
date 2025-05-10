/*Considere que no último exame de seleção para o IFAL houve três provas: português, matemática e
conhecimentos gerais. Faça um programa que leia, para vários candidatos, o nome e as notas de
cada uma das provas. O programa deverá exibir:
a) A nota média do candidato
b) Informe se o candidato foi classificado ou não. O candidato é classificado ser sua média for maior
que 5 e não apresentou nenhuma nota 0
c) A menor média
d) O nome do aluno que teve a maior média */
import java.util.Scanner;
public class exe_7 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Float nota_p, nota_m, nota_cg, nota_med, manota = (float) -1, menota = (float) 10;
        String nome, nome_manota = "";
        String cont = "S";
        
        System.out.println("Você deseja saber se um candidato está classificado, ou não? (S/N) ");
        
        while (cont == "S"){
            System.out.print("Digite o nome do candidato: ");
            nome = scanf.nextLine();
            System.out.print("Nota na prova de Português: ");
            nota_p = scanf.nextFloat();
            System.out.print("Nota na prova de Matemática: ");
            nota_m = scanf.nextFloat();
            System.out.print("Nota na prova de Conhecimentos Gerais: ");
            nota_cg = scanf.nextFloat();

            nota_med = (nota_p + nota_m + nota_cg)/3;

            if (nota_med > manota){
                nome = nome_manota;
            }
            if (nota_med < menota){
                nota_med = menota;
            }
            if (nota_med > 5 && nota_p != 0 && nota_m != 0 && nota_cg != 0){
                System.out.printf("A nota média de %s foi de %.2f , por isso está classificado", nome, nota_med);
            }
            else{
                System.out.printf("A nota média de %s foi de %.2f , por isso não foi classificado", nome, nota_med);
            }
            System.out.println("\nDeseja continuar a ler a nota de alunos (S/N)? ");
            cont = scanf.nextLine();
            cont = scanf.nextLine();
        }
        System.out.println(nome_manota);
        System.out.println(menota);
    }
}