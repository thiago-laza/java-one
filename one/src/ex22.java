import java.text.DecimalFormat;
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);
        //Criando um objeto scanner para receber a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o consumo de agua em m³: ");
        int consumo = scanner.nextInt();
        if (consumo < 0 || consumo > 1000){
            System.out.println("Valor invalido.");
            System.exit(0);
        }else {
            int consumo1 = 1;
            int consumo2 = 2;
            int consumo3 = 5;
            int valorPago =0;
            DecimalFormat df = new DecimalFormat("0.00");

            if (consumo <= 10){
                valorPago = 7;
                System.out.println(linhaHifen);
                System.out.println("Consumo em m³: " + consumo + " m³");
                System.out.println("Valor pago: R$ " + df.format(valorPago));
                System.out.println(linhaHifen);
            } else if (consumo > 10 && consumo <= 30) {
                valorPago = 7 + (consumo - 10) * 1;
                System.out.println(linhaHifen);
                System.out.println("Consumo em m³: " + consumo + " m³");
                System.out.println("Valor pago: R$ " + df.format(valorPago));
                System.out.println(linhaHifen);
            } else if (consumo > 30 && consumo < 100) {
                valorPago = 7 + 20 * 1 + (consumo - 30) * 2;
                System.out.println(linhaHifen);
                System.out.println("Consumo em m³: " + consumo + " m³");
                System.out.println("Valor pago: R$ " + df.format(valorPago));
                System.out.println(linhaHifen);
            }
        }


    }
}
