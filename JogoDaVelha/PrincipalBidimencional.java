public class PrincipalBidimencional {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
        array[0][0] = 1;
        array[1][1] = 1;
        array[2][2] = 1;

        for(int i = 0;i<array[0].length;i++){
            for (int j=0; j<array[0].length;i++){
                System.out.println("|" + array[i][j] + "|");
                if (j == array[0].length-1){
                    System.out.println();
                }
            }
        }
    }
}
