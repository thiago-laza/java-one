public class ex29 {
    public static void main(String[] args){
        

        /*  I=1 J=7
            I=1 J=6
            I=1 J=5
            I=3 J=7
            I=3 J=6
            I=3 J=5
            I=9 J=7
            I=9 J=6
            I=9 J=5
         */

         for (int i = 1; i <= 9; i *= 3) {
            for (int j = 7; j >= 5; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
    }

    
}
