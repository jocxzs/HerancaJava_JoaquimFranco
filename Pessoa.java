public class Pessoa {
    private String dataNasc;
    private String cpf;

    public Pessoa(String dataNasc,String cpf) {
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
    public Pessoa(){}

    // Metodos Getters
    public String getDataNasc() {
        return dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    // Metodos Setters
    public void setdataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void  setCpf(String cpf) {
        this.cpf = cpf;
    }
}
