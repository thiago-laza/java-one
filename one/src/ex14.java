import java.util.Scanner;

public class ex14 {
    //Leia um valor inteiro X. Em seguida apresento os 6 valores ímpares
    //consecutivos a partir do X, um valor por linha, Inclusive o X se for o caso.
    public static void main(String[] args){
        //Criando um objeto scanner para receber a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        //Recebendo a entrada do usuario
        System.out.print("Informe um valor inteiro: ");
        int valor = scanner.nextInt();
        //Determinando os 6 valores impares consecutivos a valor
        if (valor % 2 == 0){
            for (int i = 1; i <= 11; i+=2){
                System.out.println(valor + i);
            }
        }else {
            for (int i = 0; i <= 12; i+=2){
                System.out.println(valor + i);
            }
        }
    }
}
