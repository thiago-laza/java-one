import java.text.DecimalFormat;
import java.util.Scanner;

public class ex42 {
    public static void main(String[] args){
        //Criando um objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        System.out.print("Preco antigo: ");
        double precoAntigo = scanner.nextDouble();
        System.out.print("Preco novo: ");
        double precoNovo = scanner.nextDouble();
        //Fazendo os calculos
        double porcentagem = ((precoNovo - precoAntigo) / precoAntigo) * 100;
        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(porcentagem) + " %");
    }
}
