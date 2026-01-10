package IFAL.ModelosFeitos;
import IFAL.ModelosFeitos.Classes.EntradaDeCinema_exe_19;
import IFAL.ModelosFeitos.Classes.Filme_exe_18;
public class Princ_EntradadeCinema_exe_18_Filme_exe_18 {
    public static void main(String args[]){           
              
        System.out.println("Entrada sem parametro: ");
        EntradaDeCinema_exe_19 ent = new EntradaDeCinema_exe_19();
        ent.exibir();
        
        System.out.println("\n Dados do filme: ");
        Filme_exe_18 f = new Filme_exe_18();
        
        System.out.println("\nEntrada 2: ");
        EntradaDeCinema_exe_19 ent2 = new EntradaDeCinema_exe_19(f);
        ent2.exibir();
        
        System.out.println("\nEntrada 3: ");
        EntradaDeCinema_exe_19 ent3 = new EntradaDeCinema_exe_19(f);
        ent3.exibir();
        
        System.out.println("Titulo do filme da 2a entrada: "+ent2.getFilme().getTitulo());
  
       Filme_exe_18 f2 = new Filme_exe_18();
       ent3.mudarFilme(f2);
       
       //mudar o valor da 1a entrada do filme
       ent.setValor(25);
       
       //mudar a duracao do filme da 2a entrada
       
    }
}