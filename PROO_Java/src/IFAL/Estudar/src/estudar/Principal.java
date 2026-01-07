public class Principal {
    public static void main(String[] args) {
        Supervisor s = new Supervisor("IFAL", "Gardel", 1000.00, 10);
        
        s.calcularAumento();
        s.exibir();
    } 
}/*
public class Principal {

    public static void main(String[] args) {
        Empresa e = new Empresa();
        e.cadastrar();
        e.consultarPorNome();
        e.darAumento();
        e.darAumentoUmFuncionario();
    }
    
}*/