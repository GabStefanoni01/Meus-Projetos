//código feito pelo primeiro comando da capital!

public class Principal {
    public static void main(String[] args) {
        int lista[] = new int[10];

        lista[0] = 1;
        lista[2] = 20;
        for(int i = 0;i<lista.length;i++){
            System.out.println(lista[i]);
        } 

        Modelo modelos[] = new Modelo[10];
        modelos[0] = new Modelo();
        modelos[0].nome="Primeiro modelo";
        modelos[1] = new Modelo();
        modelos[1].nome="Segundo modelo";

        for(int i=2;i<modelos.length; i++){
            modelos[i] = new Modelo();
            modelos[i].nome = "Modelo da posição" + i;

        }
        for(int i = 0;i<modelos.length;i++){
            System.out.println(modelos[i].toString());
        } 
    }
}