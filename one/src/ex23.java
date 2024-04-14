import java.util.Scanner;

public class ex23 {
    public static void main(String[] args){
        //Faça um programa que leia dois valores inteiros (x e y) e imprima na tela o
        //resultado das seguintes comparações entre estes dois valores, exatamente nesta
        //ordem:
        //x é maior que y
        //x é igual a y
        //x é menor que y
        //x é diferente de y
        //x é maior ou igual a y
        //x é menor ou igual a y


        //Criando um objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        System.out.print("Informe um valor inteiro: ");
        int valor1 = scanner.nextInt();
        System.out.print("Informe um segundo valor inteiro: ");
        int valor2 = scanner.nextInt();
        //Verificando as condicoes
        if (valor1 > valor2){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        if (valor1 == valor2){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        if (valor1 < valor2){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        if (valor1 != valor2){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        if (valor1 >= valor2){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        if (valor1 <= valor2){
            System.out.println(1);
        }else {
            System.out.println(0);
        }


    }
}
