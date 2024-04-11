import java.text.DecimalFormat;
import java.util.Scanner;

public class ex08 {
    //Elabore um programa que permita calcular o Imposto de Renda (IR) de um casal
    //a partir das rendas do Homem (RH) e da Mulher (RM). O imposto é calculado sobre
    //a renda conjunta (RC=RH+RM) de acordo com a tabela abaixo:
    //Renda ConjuntaAlíquota - IR
    //Até 900.00 Isento
    //De 900.01 até 1500.00 10%
    //De 1500.01 até 2500.00 15%
    //Acima de 2500.00 25%
    public static void main(String[] args){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Criando um objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        System.out.print("Renda do homem: ");
        double rendaHomem = scanner.nextFloat();
        System.out.print("Renda da mulher: ");
        double rendaMulher = scanner.nextFloat();
        //Gerendo a variavel rendaConjunta:
        double rendaConjunta = (double) rendaHomem + rendaMulher;
        //Verificando as condicoes para a aliquota
        DecimalFormat df = new DecimalFormat("0.00");


        if (rendaConjunta < 900){
            double aliquota = 0;
            double ir = rendaConjunta*aliquota;
            double rendaLiquida = rendaConjunta - ir;
            System.out.println(linhaHifen);
            System.out.println("Renda conjunta: " + df.format(rendaConjunta));
            System.out.println("Aliquota utilizada: " + df.format(aliquota));
            System.out.println("Imposto de renda: " + df.format(ir));
            System.out.println("Renda liquida: " + df.format(rendaLiquida));
            System.out.println(linhaHifen);
        } else if (rendaConjunta < 1500) {
            double aliquota = 0.1;
            double ir = rendaConjunta*aliquota;
            double rendaLiquida = rendaConjunta - ir;
            System.out.println(linhaHifen);
            System.out.println("Renda conjunta: " + df.format(rendaConjunta));
            System.out.println("Aliquota utilizada: " + aliquota*100 + "%");
            System.out.println("Imposto de renda: " + df.format(ir));
            System.out.println("Renda liquida: " + df.format(rendaLiquida));
            System.out.println(linhaHifen);
        } else if (rendaConjunta < 2500) {
            double aliquota = 0.15;
            double ir = rendaConjunta*aliquota;
            double rendaLiquida = rendaConjunta - ir;
            System.out.println(linhaHifen);
            System.out.println("Renda conjunta: " + df.format(rendaConjunta));
            System.out.println("Aliquota utilizada: " + aliquota*100 + "%");
            System.out.println("Imposto de renda: " + df.format(ir));
            System.out.println("Renda liquida: " + df.format(rendaLiquida));
            System.out.println(linhaHifen);
        }else {
            double aliquota = 0.25;
            double ir = rendaConjunta*aliquota;
            double rendaLiquida = rendaConjunta - ir;
            System.out.println(linhaHifen);
            System.out.println("Renda conjunta: " + df.format(rendaConjunta));
            System.out.println("Aliquota utilizada: " + aliquota*100 + "%");
            System.out.println("Imposto de renda: " + df.format(ir));
            System.out.println("Renda liquida: " + df.format(rendaLiquida));
            System.out.println(linhaHifen);
        }
    }
}
