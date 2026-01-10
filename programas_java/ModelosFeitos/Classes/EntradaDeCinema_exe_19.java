package IFAL.ModelosFeitos.Classes;

import java.util.Scanner;


public class EntradaDeCinema_exe_19 {
    private String dataFilme;
    private String hora;
    private int sala;
    private float valor;
    private Filme_exe_18 filme;
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public EntradaDeCinema_exe_19(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Data do filme: ");
        dataFilme = leitura.next();
        System.out.println("Hora do filme: ");
        hora = leitura.next();
        System.out.println("Informe valor:");
        valor = leitura.nextFloat();
        System.out.println("Sala: ");
        sala = leitura.nextInt();
        filme = new Filme_exe_18();
    }
    
    public EntradaDeCinema_exe_19(Filme_exe_18 filme){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Data do filme: ");
        dataFilme = leitura.next();
        System.out.println("Hora do filme: ");
        hora = leitura.next();
        System.out.println("Informe valor:");
        valor = leitura.nextFloat();
        System.out.println("Sala: ");
        sala = leitura.nextInt();
        this.filme = filme;
    }

    public EntradaDeCinema_exe_19(String dataFilme, String hora, int sala, float valor, Filme_exe_18 filme) {
        this.dataFilme = dataFilme;
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
        this.filme = filme;
    }
    
    public void mudarFilme(){
        System.out.println("Novo filme: ");
        filme = new Filme_exe_18();
    }
    
    public void mudarFilme(Filme_exe_18 filme){
        this.filme = filme;
    }
    
    public void exibir(){
        System.out.println("Entrada de cinema: "+dataFilme+" "+sala);
        filme.exibir();
    }
    
    public Filme_exe_18 getFilme(){
        return filme;
    }
    
    
}