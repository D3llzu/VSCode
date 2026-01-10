import java.sql.*;

public class Conexao {
    static Connection conexao = null;
    String user = "root";
    String password = "password";
    String database = "aula";
    String url = "jdbc:mysql://localhost:3306/"+database;
    

    public Conexao() {
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database , "root", "password");
            System.out.println("Conexao realizada com sucesso");
        } catch (Exception e) {
            System.out.println("Problema na conexao: " + e);
        }
    }

    public static Connection getConexao() {
        return conexao;
    }
}
