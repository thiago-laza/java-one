import java.util.Scanner;

public class ex18 {
    //Faça um programa que inverta um número inteiro com quatro algarismos.
    public static void main(String[] args){
        //Criando um objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo a entrada do usuario
        System.out.print("Digite um numero com 4 algarismos: ");
        int numero = scanner.nextInt();
        //Invertenso a ordem dos algarismos
        int unidade = numero % 10;
        int dezena = (numero % 100 - unidade) / 10;
        int centena = ((numero % 1000) - (dezena * 10 + unidade)) / 100;
        int milhar = (numero - (centena * 100 + dezena * 10 + unidade)) / 1000;
        int numeroInvertido = unidade * 1000 + dezena * 100 + centena * 10 + milhar;
        System.out.println(numeroInvertido);
    }
}
