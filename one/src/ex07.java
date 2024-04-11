import java.util.Scanner;

public class ex07 {
    //Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
    //(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100,
    //50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
    public static void main(String[] args){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Criando um objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        System.out.print("Informe o valor para ser sacado: ");
        int valor = scanner.nextInt();
        //Determinando o numero minimo de cedulas
        int cedula100 = valor / 100;
        int cedula50 = (valor - (cedula100 * 100)) / 50;
        int cedula20 = (valor - (cedula100 * 100 + cedula50 * 50)) / 20;
        int cedula10 = (valor - (cedula100 * 100 + cedula50 * 50 + cedula20 * 20)) / 10;
        int cedula5 = (valor - (cedula100 * 100 + cedula50 * 50 + cedula20 * 20 + cedula10 * 10)) / 5;
        int cedula2 = (valor - (cedula100 * 100 + cedula50 * 50 + cedula20 * 20 + cedula10 * 10 + cedula5 * 5)) / 2;
        int cedula1 = (valor - (cedula100 * 100 + cedula50 * 50 + cedula20 * 20 + cedula10 * 10 + cedula5 * 5 + cedula2 * 2));
        System.out.println(cedula100 + " nota(s) de R$ 100,00");
        System.out.println(cedula50 + " nota(s) de R$ 50,00");
        System.out.println(cedula20 + " nota(s) de R$ 20,00");
        System.out.println(cedula10 + " nota(s) de R$ 10,00");
        System.out.println(cedula5 + " nota(s) de R$ 5,00");
        System.out.println(cedula2 + " nota(s) de R$ 20,00");
        System.out.println(cedula1 + " nota(s) de R$ 1,00");




    }
}
