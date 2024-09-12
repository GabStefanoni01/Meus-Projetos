public class Peixe extends Pets{

    public Peixe(String nome) {
        super(nome);
    }

    public Peixe(String nome, String acao, String alimento, String som) {
        super(nome, acao, alimento, som);
    }
    
    public String getSom() {
        return "Glub glub";
    }


}
