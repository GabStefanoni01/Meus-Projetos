public class CaoDeGuarda extends Cao {

    public CaoDeGuarda(String nome) {
        super(nome);
    }

    public CaoDeGuarda(String nome, String acao, String alimento, String som) {
        super(nome, acao, alimento, som);
    }    

    public String getAcao() {
        return "Proteger e atacar";
    }
    
}
