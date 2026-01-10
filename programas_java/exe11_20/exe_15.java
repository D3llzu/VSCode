/*2 – Crie uma classe chamada Responsavel. Esta classe possui os atributos: nome, telefone gênero. Esta classe possui os 
seguintes métodos: 
cadastrar (inserir os dados dos responsável), exibir (exibe nome e telefone do responsavel) e atualizarTelefone 
(atualiza o telefone do responsável).*/
package IFAL.exe11_20;
import IFAL.Classes.Responsavel_exe_15_16;
public class exe_15 {
    public static void main(String[] args) {
        Responsavel_exe_15_16 res = new Responsavel_exe_15_16 ();
        
        res.cadastrar();
        res.exibir();
        res.atualizarTelefone();
        res.exibir();
    }
}