public class Jogo {
    public static void main(String[] args)  {
        Personagem cacador = new Personagem();
        Personagem soneca = new Personagem();
        System.out.println(cacador);
        System.out.println(cacador.toString());
        Personagem apelidoCacador = cacador;
        System.out.println(apelidoCacador.toString());  
        cacador.nome =  " Pedro Padoan ";
        soneca.nome =  "Kleber nunes";
        System.out.println(apelidoCacador.nome);
        while(true){
        cacador.cacar();
        soneca.dormir();
        cacador.comer();
        soneca.dormir();
        cacador.dormir();
        soneca.dormir(); 
        cacador.cacar();
        soneca.comer();
        cacador.cacar();
        soneca.cacar();
        cacador.cacar();
        System.out.println("===");
        try {
            Thread.sleep(2000);
        }catch(Exception e) {
            System.out.println("Deu ruim ae!!!");
        }
        
        }
    }
}