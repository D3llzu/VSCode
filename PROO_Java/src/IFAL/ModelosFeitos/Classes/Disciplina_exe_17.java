/*Esse modelo foi um exemplo diferente que a professora passou para a questão, mas pelo visto é a mesma forma de 
resolver*/
package IFAL.ModelosFeitos.Classes;
import java.util.Scanner;

public class Disciplina_exe_17 {
    public String nome;
    public int cargaHoraria;
    public int codigo;
    public Scanner teclado = new Scanner(System.in);
    
     //construtor
    public Disciplina_exe_17(){
        System.out.println("Qual o nome da disciplina? ");
        nome = teclado.nextLine();
        System.out.println("Qual a carga horaria? ");
        cargaHoraria = teclado.nextInt();
        
        exibir();
    }
    
   
    public Disciplina_exe_17(String nome, int cargaHoraria, int codigo){
        System.out.println("Construtor com parametros");
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.codigo = codigo;        
    }       
    
        
    //métodos
    public void exibir(){
        System.out.println("Dados da disciplina: "+codigo+" "
                + nome+" "+cargaHoraria);
    }
    public void atualizarCargaHoraria(){
        System.out.println("Qual a nova carga horaria?");
        cargaHoraria = teclado.nextInt();
        System.out.println("Carga horaria atualizada!");
    }
   
    public void ler(){
        System.out.println("Qual o nome da disciplina? ");
        nome = teclado.nextLine();
        System.out.println("Qual a carga horaria? ");
        cargaHoraria = teclado.nextInt();
        System.out.println("Qual o código da disciplina?");
        codigo = teclado.nextInt();
    }
}