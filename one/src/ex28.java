public class ex28 {
    public static void main(String[] args){
        
        /*I=1 J=60
          I=4 J=55
          I=7 J=50
          …
          I=? J=0 */
          
          for (int i = 1, j = 60; j >= 0; i+=3, j-=5){
                System.out.println("I = " + i + "  J = " + j);
          }
}
}
