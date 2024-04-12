import java.text.DecimalFormat;
import java.util.Scanner;

public class ex20 {
    //A ELETROSHOCK S.A. é uma empresa de distribuição de energia bastante
    //justa (pelo menos ela se diz ser!). Ela faz cobrança proporcional com a renda da
    //família e do bairro. O programa deve imprimir uma mensagem de erro caso o bairro
    //digitado seja inválido. Além disso, caso a renda da pessoa caia fora das faixas da
    //tabela, não haverá desconto. Se a renda OU o consumo forem valores negativos,
    //deve ser emitida uma mensagem de erro.
    //O programa deve ler o código do bairro (S: Santa Ana; I: Industriários; T: Tabatinga),
    //a renda da família e o consumo em reais e obter o desconto de acordo com a tabela
    //abaixo:
    //  Bairro                     Renda (R$)                  Desconto (R$)
    // Santa Ana                   [50; 500]                      50
    //                            (500; 1000]                     25
    //
    // Industriários              [240; 1000]                     240
    //                            (1000; 5000]                    120
    //

    // Tabatinga                   (5000; 1000]                    720
    //                             (10000; 20000]                  360
    //
    public static void main(String[] args) {
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);


        //Criando um objeto scanner para as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas dos usuario
        System.out.print("Bairro: ");
        String bairro = scanner.next();
        if (!bairro.equals("s") && !bairro.equals("i") && !bairro.equals("t")) {
            System.out.println("Bairro invalido.");
            System.out.println("Programa encerrado.");
            System.exit(0);
        }
        System.out.print("Renda: ");
        double renda = scanner.nextDouble();
        if (renda < 0) {
            System.out.println("Valor invalido.");
            System.out.println("O programa sera encerrado.");
            System.exit(0);
        }
        System.out.print("Consumo: ");
        double consumo = scanner.nextDouble();
        if (consumo < 0) {
            System.out.println("Valor invalido.");
            System.out.println("O programa sera encerrado.");
            System.exit(0);
        }

        //Criando o objeto DecimalFormat
        DecimalFormat df = new DecimalFormat("0.00");

        if (bairro.equals("s")) {
            System.out.println(linhaHifen);
            System.out.println("Bairro: Santa Ana.");
            if (renda >= 50 && renda <= 500) {
                int desconto = 50;
                System.out.println("Renda: R$ " + df.format(renda));
                System.out.println("Desconto: R$ " + df.format(desconto));
                System.out.println("Valor do consumo: R$ " + df.format(consumo));
                consumo = consumo - desconto;
                System.out.println("Valor com desconto: R$ " + df.format(consumo));
                System.out.println(linhaHifen);
            } else if (renda > 500 && renda <= 1000) {
                int desconto = 25;
                System.out.println("Renda: R$ " + df.format(renda));
                System.out.println("Desconto: R$ " + df.format(desconto));
                System.out.println("Valor do consumo: R$ " + df.format(consumo));
                consumo = consumo - desconto;
                System.out.println("Valor com desconto: R$ " + df.format(consumo));
                System.out.println(linhaHifen);
            } else {
                int desconto = 0;
                System.out.println("Renda: R$ " + df.format(renda));
                System.out.println("Desconto: R$ " + df.format(desconto));
                System.out.println("Valor do consumo: R$ " + df.format(consumo));
                consumo = consumo - desconto;
                System.out.println("Valor com desconto: R$ " + df.format(consumo));
                System.out.println(linhaHifen);
            }
        } else if (bairro.equals("i")) {
            System.out.println(linhaHifen);
            System.out.println("Bairro: Industriarios");
            if (renda >= 240 && renda <= 1000) {
                int desconto = 240;
                System.out.println("Renda: R$ " + df.format(renda));
                System.out.println("Desconto: R$ " + df.format(desconto));
                System.out.println("Valor do consumo: R$ " + df.format(consumo));
                consumo = consumo - desconto;
                System.out.println("Valor com desconto: R$ " + df.format(consumo));
                System.out.println(linhaHifen);
            } else if (renda > 1000 && renda <= 5000) {
                int desconto = 120;
                System.out.println("Renda: R$ " + df.format(renda));
                System.out.println("Desconto: R$ " + df.format(desconto));
                System.out.println("Valor do consumo: R$ " + df.format(consumo));
                consumo = consumo - desconto;
                System.out.println("Valor com desconto: R$ " + df.format(consumo));
                System.out.println(linhaHifen);
            } else {
                int desconto = 0;
                System.out.println("Renda: R$ " + df.format(renda));
                System.out.println("Desconto: R$ " + df.format(desconto));
                System.out.println("Valor do consumo: R$ " + df.format(consumo));
                consumo = consumo - desconto;
                System.out.println("Valor com desconto: R$ " + df.format(consumo));
                System.out.println(linhaHifen);
            }

        } else if (bairro.equals("t")) {
            System.out.println(linhaHifen);
            System.out.println("Bairro: Tabatinga");
            if (renda > 5000 && renda <= 10000) {
                int desconto = 720;
                System.out.println("Renda: R$ " + df.format(renda));
                System.out.println("Desconto: R$ " + df.format(desconto));
                System.out.println("Valor do consumo: R$ " + df.format(consumo));
                consumo = consumo - desconto;
                System.out.println("Valor com desconto: R$ " + df.format(consumo));
                System.out.println(linhaHifen);
            } else if (renda > 10000 && renda < 20000) {
                int desconto = 360;
                System.out.println("Renda: R$ " + df.format(renda));
                System.out.println("Desconto: R$ " + df.format(desconto));
                System.out.println("Valor do consumo: R$ " + df.format(consumo));
                consumo = consumo - desconto;
                System.out.println("Valor com desconto: R$ " + df.format(consumo));
                System.out.println(linhaHifen);
            } else {
                int desconto = 0;
                System.out.println("Renda: R$ " + df.format(renda));
                System.out.println("Desconto: R$ " + df.format(desconto));
                System.out.println("Valor do consumo: R$ " + df.format(consumo));
                consumo = consumo - desconto;
                System.out.println("Valor com desconto: R$ " + df.format(consumo));
                System.out.println(linhaHifen);
            }

        }
    }
}