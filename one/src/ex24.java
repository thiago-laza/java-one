import java.util.Scanner;

public class ex24 {
    public static void main(String[] args){
        //Criando um objeto scanner para a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo a entrada do usuario
        System.out.print("Escreva um numero de 5 algarismos para saber se e um palidromo: ");
        int numero = scanner.nextInt();
        //Verificando se e palindromo
        int p1 = numero / 10000;
        int p2 = (numero / 1000) % 10;
        int p4 = (numero / 10) % 10;
        int p5 = numero % 10;

        if (p1 == p5 && p2 == p4){
            System.out.println(numero + " e um palindromo.");
        }else {
            System.out.println(numero + " nao e um palindromo.");
        }


    }
}
