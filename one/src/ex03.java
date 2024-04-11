import java.text.DecimalFormat;
import java.util.Scanner;

public class ex03 {
    //Faça um programa que lê o nome de um vendedor, o seu salário fixo e o total de
    //vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha
    //15% de comissão sobre suas vendas efetuadas, informar o total a receber no final
    //do mês, com duas casas decimais.
    public static void main(String[] args){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Criando um objeto scanner para receber as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Solicitando as entradas do usuario
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Salario fixo: ");
        float salarioFixo = scanner.nextFloat();
        System.out.print("Total de vendas: ");
        float totalVendas = scanner.nextFloat();
        //Calculando o salario final
        float salarioFinal = (float) (totalVendas * 0.15 + salarioFixo);
        //Formatando para duas casas decimais
        DecimalFormat df = new DecimalFormat("#.##");
        //Exibindo o resultado
        System.out.println(linhaHifen);
        System.out.println("TOTAL: " +df.format(salarioFinal));
        System.out.println(linhaHifen);

    }
}
