public class ex13 {
    //Faça um programa que mostre os números pares entre 1 e 100, inclusive.
    public static void main(String[] args){
        /*
        for (int i = 2; i <= 100; i+=2){
            System.out.println(i);
        }*/
        /*
        int cont = 0;
        while (cont < 100){
            cont+=2;
            System.out.println(cont);
        }*/
        int cont = 0;
        while (cont <= 100){
            cont++;
            if (cont % 2 == 0){
                System.out.println(cont);
            }
        }
    }
}
