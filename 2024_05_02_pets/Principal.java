public class Principal {
    public static void main(String[] args) {
        
//        Pets bicho1 = new Pets("Rex");
        Cao bicho1 = new Cao("Rex");
        System.out.println(bicho1.getNome());
        System.out.println(bicho1.getSom());
        Pets apelidoBicho1 = bicho1;
        System.out.println(apelidoBicho1.getNome());
        System.out.println(apelidoBicho1.getSom());
        System.out.println(bicho1.temFebre(40.5));
        CaoDeGuarda bichoDeGuarda = new CaoDeGuarda("Pastor");
        bichoDeGuarda.setAcao("Lamber");
        System.out.println(bichoDeGuarda.getAcao());
        System.out.println(bichoDeGuarda.temFebre(38.0));
        bicho1.setAcao("Lamber");
        System.out.println(bicho1);

    }
}
