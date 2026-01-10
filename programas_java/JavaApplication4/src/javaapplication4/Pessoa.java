package javaapplication4;
public abstract class Pessoa{
    private String nome, cpf, dat_nasc;
    
    public Pessoa (String nome, String cpf, String dat_nasc){
        nome = this.nome;
        cpf = this.cpf;
        dat_nasc = this.dat_nasc;
    }
    public abstract void Boleto();
    public String getNome(){
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDat_nasc() {
        return dat_nasc;
    }
    public void setDat_nasc(String dat_nasc) {
        this.dat_nasc = dat_nasc;
    }
}