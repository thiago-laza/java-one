import java.util.Scanner;

public class ex04 {
    //Faça um programa que leia do teclado três valores inteiros e exiba o maior e
    //menor entre eles.
    public static void main(String[] args){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);
        //Criando um objeto scanner para receber as entradas do usuarios
        Scanner scanner = new Scanner(System.in);
        //Recebendo as entradas do usuario
        System.out.print("Informe o primeiro valor: ");
        int primeiroValor = scanner.nextInt();
        System.out.print("Informe o segundo valor: ");
        int segundoValor = scanner.nextInt();
        System.out.print("Informe o terceiro valor: ");
        int terceiroValor = scanner.nextInt();
        //Avaliando qual o maior e o menor

        int maior = primeiroValor;
        int menor = primeiroValor;

        if (segundoValor < primeiroValor && segundoValor < terceiroValor){
            menor = segundoValor;
            System.out.println("Menor: " + menor);
        } else if (terceiroValor < primeiroValor && terceiroValor < primeiroValor) {
            menor = terceiroValor;
            System.out.println("Menor: " + menor);
        }else {
            System.out.println("Menor: " + menor);
        }

        if (segundoValor > primeiroValor && segundoValor > terceiroValor){
            maior = segundoValor;
            System.out.println("Maior: " + maior);
        } else if (terceiroValor > segundoValor && terceiroValor > primeiroValor) {
            maior = terceiroValor;
            System.out.println("Maior: " + maior);
        }else {
            System.out.println("Maior: " + maior);
        }


    }
}
