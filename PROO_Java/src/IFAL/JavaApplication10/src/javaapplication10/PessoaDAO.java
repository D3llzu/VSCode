
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
        
public class PessoaDAO { 
    Connection conexao;

    public PessoaDAO(){
        conexao = new Conexao().getConexao();        
    }
      
    //inserir os dados de uma pessoa no mysql
    public void inserir(Pessoa p){
        try{
            String sql = "insert into Pessoa (id, nome, cpf, idade) values ( ?,?,?,?)"; 
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNome());
            ps.setString(3, p.getCpf());
            ps.setInt(4, p.getIdade());

            ps.executeUpdate();//envia pra o mysql
            
        }catch(Exception e){
            System.out.println("Erro no banco: "+e);
        }

    }
    
    public void remover(int id){
        try{
            String sql = "delete from Pessoa where id = ?"; 
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setInt(1, id);           

            ps.executeUpdate();//envia pra o mysql
            
        }catch(Exception e){
            System.out.println("Erro no banco: "+e);
        }
      
         
    }
    
    public void atualizar(int id){
        //UPDATE pessoa SET disponivel=1 WHERE titulo='O Diário de Anne Frank';

    }
    
        
    public ArrayList<Pessoa> consultarTodos(){
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        try{
            String sql = "select * from pessoa"; 
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Pessoa p = new Pessoa(rs.getInt("id"), rs.getString("nome"),
                rs.getString("cpf"), rs.getInt("idade"));
               
                pessoas.add(p);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro na consulta");
        }
        
        return pessoas;
    }
    
    
}