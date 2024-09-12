public class Cao extends Pets implements Saudavel{

    public Cao(String nome) {
        super(nome);
    }
    
    public Cao(String nome, String acao, String alimento, String som) {
        super(nome, acao, alimento, som);
    }

    public String getSom() {
        return "Au au";
    }

    @Override
    public boolean temFebre(double temperatura) {
        if(temperatura > 39.5) {
            return true;
        }
        return false;
    }

    @Override
    public boolean estaPalido(String cor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estaPalido'");
    }

}
