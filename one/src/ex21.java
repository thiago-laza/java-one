import java.text.DecimalFormat;
import java.util.Scanner;

public class ex21 {
    //João e Maria estão querendo obter informações sobre Os carros da sua cidade.
    //Para isso eles pediram que você escrevesse um programa para ajudá-los. Eles vão
    //digitar Informações de três diferentes carros. Para cada carro serão lidos o ano e a
    //velocidade. O programa deve exibir, o ano do carro mais novo e a velocidade do
    //mais rápido.
    //Entrada
    //Um valor inteiro (ano) e um em ponto flutuante (velocidade).
    //Saída
    //Maior velocidade, maior ano e velocidade média.
    public static void main(String[] args){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);


        //Criando um objeto scanner para receber as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Recebendo as entradas do usuario
        System.out.print("Informe o ano do primeiro carro: ");
        int ano1 = scanner.nextInt();
        System.out.print("Informe a velocidade do primeiro carro: ");
        double vel1 = scanner.nextDouble();
        System.out.print("Informe o ano do segundo carro: ");
        int ano2 = scanner.nextInt();
        System.out.print("Informe a velocidade do segundo carro: ");
        double vel2 = scanner.nextDouble();
        System.out.print("Informe o ano do terceiro carro: ");
        int ano3 = scanner.nextInt();
        System.out.print("Informe a velocidade do terceiro carro: ");
        double vel3 = scanner.nextDouble();
        //Verificando as condicoes
        int carroNovo = ano1;
        double carroRapido = vel1;

        if (ano2 > ano1 && ano2 > ano3){
            carroNovo = ano2;
        } else if (ano3 > ano1 && ano3 > ano2) {
            carroNovo = ano3;
        }
        if (vel2 > vel1 && vel2 > vel3){
            carroRapido = vel2;
        } else if (vel3 > vel1 && vel3 > vel2) {
            carroRapido = vel3;
        }

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(linhaHifen);
        System.out.println("Ano do carro mais novo = " + carroNovo );
        System.out.println("Velocidade do carro mais rapido = " + df.format(carroRapido));
    }
}
