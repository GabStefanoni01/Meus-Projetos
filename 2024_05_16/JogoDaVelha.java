public class JogoDaVelha {
    protected static final int X = 1 , O = -1;
    protected static final int VAZIO = 0;
    protected int tabuleiro[][] = new int[3][3];
    protected int jogador;
 
    public JogoDaVelha() {
        limpaTabuleiro();
    }
 
    public void limpaTabuleiro() {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabuleiro[i][j] = VAZIO;
            }
        }
    }
 
    public void poePeca(int i, int j){
        if(i < 0 || i > 2 || j < 0 || j > 2){
            throw new IllegalArgumentException("Posição Invalida");
        }
        if(tabuleiro[i][j]!= VAZIO){
            throw new IllegalArgumentException("Posição Ocupada");
        }
        tabuleiro[i][j] = jogador;
        jogador = -jogador;
    }
}
 