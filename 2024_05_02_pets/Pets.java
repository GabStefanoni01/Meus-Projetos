public class Pets {
    private String nome;
    private String acao;
    private String alimento;
    private String som;
    private String Cor;
    private String CorAtual;

    public Pets(String nome, String acao, String alimento, String som, String Cor, String CorAtual) {
        this.nome = nome;
        this.acao = acao;
        this.alimento = alimento;
        this.som = som;
    }
    
    public Pets(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    final public String toString() {
        return this.nome + " - " + this.getSom();
    }

}