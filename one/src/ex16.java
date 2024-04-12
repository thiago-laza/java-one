import java.util.Scanner;

public class ex16 {
    //Supondo que a população de um país A seja recebido via teclado em uma
    //variável com dupla precisão (double) representando a população atual daquele país
    //que possui uma taxa anual de crescimento de 3% a.a. o que a população de um
    //país B seja recebida também em uma variável com dupla precisão e que tenha uma
    //taxa anual de crescimento de 1,5% a.a., fazer um programa que calcule e de anos
    //necessários para que a população do país A ultrapasse ou iguale a população do
    //número do país B, mantida essas taxas de crescimento.
    public static void main(String[] args){
        //Criando um objeto scanner para receber as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Recebendo as entradas do usuario
        System.out.printf("Populacao do pais A: ");
        double popA = scanner.nextDouble();
        System.out.printf("Populacao do pais B: ");
        double popB = scanner.nextDouble();
        //Calculando a populacao
        int cont = 0;
        while (popA <= popB){
            popA *= 1.03;
            popB *= 1.015;
            cont ++;
        }
        System.out.print(cont + " anos.");
    }
}
