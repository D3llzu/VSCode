package IFAL.exe1_10;
/*9. O shopping da cidade fez uma pesquisa entre seus clientes. Foram coletados os seguintes dados: 
idade, gênero (F/M) e salário. 
Faça um programa que calcule e mostre para um número indeterminado de pessoas:
a. A média dos salários do grupo;
b. A média dos salários das mulheres;
c. A quantidade de mulheres com salário de até R$ 2000,00;
d. A quantidade de homens;
e. A quantidade de homens entre 15 e 25 anos.
Defina uma condição adequada de parada da leitura. */
import java.util.Scanner;
public class exe_9 {
    public static void main (String [] args){
        Scanner scanf = new Scanner (System.in);
        int idademasc = 0, idadefem = 0, salmasc = 0, salfem = 0, salfemkk = 0, cont = 0;
        int salmasctot = 0, salfemtot = 0;
        int contfem = 0, contfemkk = 0, contmasc = 0, contmascentr = 0, salmascentr = 0;

        System.out.println("Boa tarde! Deseja cadastrar uma pessoa em nosso site? ");
        while (scanf.next().equalsIgnoreCase("sim")){
            System.out.print("\nO gênero é (F / M): ");

            if (scanf.next().equalsIgnoreCase("F")){
                System.out.print("\nQual o salário: ");
                salfem = scanf.nextInt();

                salfemtot = salfemtot + salfem;
                
                if (salfem < 2000){
                    salfemkk = salfemkk + salfem;
                    contfemkk++;
                }

                System.out.print("\nQual a idade: ");
                idadefem = scanf.nextInt();

                contfem++;
                }

            else if (scanf.next().equalsIgnoreCase("M")){
                System.out.print("\nQual o salário: ");
                salmasc = scanf.nextInt();
                
                salmasctot = salmasctot + salmasc;

                System.out.print("\nQual a idade: ");
                idademasc = scanf.nextInt();

                if (15 < idademasc && idademasc < 25){
                    salmascentr = salmascentr + salmasc;
                    contmascentr++;
                }

                contmasc++;
            }
            
            else if (!scanf.next().equalsIgnoreCase("M") || !scanf.next().equalsIgnoreCase("F")) {
                System.out.println("Por favor, insira novamente!");
                break;
            }
            
                cont++;
                System.out.printf("A média salarial de todos da equipe é: R$%.2f", (float) (salmasctot + salfemtot) / cont);
                System.out.printf("\nA média salarial de todas as mulheres é: R$%.2f", (float) salfemtot / contfem);
                System.out.printf("\nExiste um total de %d mulheres com salários de até R$2000,00. Totalizando: R$%.2f", contfemkk, (float) salfemkk);
                System.out.printf("\nExistem um total de %d homens na empresa. Totalizando R$%.2f", contmasc, (float) salmasctot);
                System.out.printf("\nExistem um total de %d de homens que tem entre 15 e 25 anos. Totalizando R$%.2f", contmascentr, (float) salmascentr);

            System.out.print("\n\nDeseja continuar? ");
        }
    }
}