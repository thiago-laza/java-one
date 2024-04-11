import java.util.Scanner;

public class ex15 {
    //A sequência de números 0 1 1 2 3 5 6 8 13 21 ... é conhecida como série de
    //Fibonacci. Nesta sequência, cada número, depois dos 2 primeiros, é igual à soma
    //dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N
    //primeiros números dessa série.
    public static void main(String[] args){
        //Criando um objeto scanner para receber as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo a entrada do usuario
        System.out.print("Digite um valor n: ");
        int n = scanner.nextInt();
        //Determinando os n primeiros numeros da sequencia de Fibonacci.
        System.out.println("Os " + n + " primeiros numeros da sequencia de Fibonacci sao: ");
        int n1 = 0;
        int n2 = 1;

        System.out.print(n1 + " ");
        System.out.print(n2 + " ");

        for (int i = 1;i < n - 1;i++){
            int valor = n1 + n2;
            n1 = n2;
            n2 = valor;
            System.out.print(valor + " ");

        }
    }
}
