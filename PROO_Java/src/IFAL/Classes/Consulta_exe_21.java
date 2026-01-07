package IFAL.Classes;
import java.util.Scanner;
public class Consulta_exe_21 { 
    Scanner scanf = new Scanner (System.in);
    Endereco_exe_21 end = new Endereco_exe_21();
    Pessoa_exe_21 pes = new Pessoa_exe_21 ();
    Pessoa_exe_21 pes2 = new Pessoa_exe_21 ();

    String data, hora;
    double valor;
    
    public Consulta_exe_21(){
        System.out.println("Data (__/__): " + data);
        data = scanf.nextLine();
        System.out.println("Hora (__:__): " + hora);
        
}
    
}
