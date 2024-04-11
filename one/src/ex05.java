import java.util.Scanner;

public class ex05 {
    //Faça um programa que leia do teclado três valores inteiros e exiba-os em ordem
    //crescente.
    public static void main(String[] args){

        //Criando um objeto scanner para as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        int primeiroValor = scanner.nextInt();
        System.out.print("Informe o segundo valor: ");
        int segundoValor = scanner.nextInt();
        System.out.print("Informe o terceiro valor: ");
        int terceiroValor = scanner.nextInt();

        //Verificando ordem crescente
        if (primeiroValor <= segundoValor && primeiroValor <= terceiroValor){
            if (segundoValor <= terceiroValor){
                System.out.println("Os valores na ordem crescente sao: ");
                System.out.println(primeiroValor + "," +  segundoValor + "," +  terceiroValor);
            }else {
                System.out.println("Os valores na ordem crescente sao: ");
                System.out.println(primeiroValor + "," +  terceiroValor + "," +  segundoValor);
            }
        } else if (segundoValor <= primeiroValor && segundoValor <= terceiroValor) {
            if (primeiroValor <= terceiroValor){
                System.out.println("Os valores na ordem crescente sao: ");
                System.out.println(segundoValor + "," +  primeiroValor + "," +  terceiroValor);
            }else {
                System.out.println("Os valores na ordem crescente sao: ");
                System.out.println(segundoValor + "," +  terceiroValor + "," +  primeiroValor);
            }
        } else if (terceiroValor <= primeiroValor && terceiroValor <= segundoValor) {
            if (primeiroValor <= segundoValor){
                System.out.println("Os valores na ordem crescente sao: ");
                System.out.println(terceiroValor + "," +  primeiroValor + "," +  segundoValor);
            }else {
                System.out.println("Os valores na ordem crescente sao: ");
                System.out.println(terceiroValor + "," +  segundoValor + "," +  primeiroValor);
            }
        }

    }
}
