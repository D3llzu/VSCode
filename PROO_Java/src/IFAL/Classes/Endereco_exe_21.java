package IFAL.Classes;
import java.util.Scanner;
public class Endereco_exe_21{
    Scanner scanf = new Scanner (System.in);
    private String cidade, cep, rua, bairro;
    
    public Endereco_exe_21(){
        System.out.println("Cidade: ");
        cidade = scanf.nextLine();
        System.out.println("CEP: ");
        cep = scanf.nextLine();
        System.out.println("Rua: ");
        rua = scanf.nextLine();
        System.out.println("Bairro: ");
        bairro = scanf.nextLine();
    }
    public String setCidade(){
        return cidade; 
    }
    public void getCidade (String cidade){
        this.cidade = cidade;
    }
    public String setCep(){
        return cep;
    }
    public void getCep (String cep){
        this.cep = cep;
    }
    public String setRua (){
        return rua;
    }
    public void getRua (String rua){
        this.rua = rua;
    }
    public String setBairro (){
        return bairro;
    }
    public void getBairro (String bairro){
        this.bairro = bairro;
    }
    
    public void exibir(){
        System.out.println("Cidade: " + cidade +
                "CEP: " + cep +
                "Rua: " + rua +
                "Bairro: " + bairro
        );
    }
    public void atualizar(){ 
       System.out.println("Cidade: ");
        cidade = scanf.nextLine();
        System.out.println("CEP: ");
        cep = scanf.nextLine();
        System.out.println("Rua: ");
        rua = scanf.nextLine();
        System.out.println("Bairro: ");
        bairro = scanf.nextLine();
    }
}