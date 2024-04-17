import java.util.Scanner;

public class ex32 {
    public static void main(String[] args){
        /*Um posto de combustíveis deseja determinar qual de seus produtos tem a
        preferência de seus clientes. Escreva um programa para ler o tipo de combustível
        abastecido (codificado da seguinte forma: 1. Álcool 2. Gasolina 3. Diesel) e a
        quantidade de litros anotados em 5 abastecimentos realizados. */

        //Criando um objeto scanner para as entradas dos usurario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario e as condicoes
        int cont = 0;

        int contAlcool = 0;
        int contGasolina = 0;
        int contDiesel = 0;

        float quantAlcool = 0;
        float quantGasolina = 0;
        float quantDiesel = 0;

        while (cont < 5) {
            System.out.print("Alcool(1) Gasolina(2) Diesel(3): ");
            int combustivel = scanner.nextInt();
            if (combustivel == 1) {
                System.out.print("Qtd litros: ");
                float alcool = scanner.nextFloat();
                quantAlcool += alcool;
                contAlcool++;
                cont++;
            }else if (combustivel == 2) {
                System.out.print("Qtd litros: ");
                float gasolina = scanner.nextFloat();
                quantGasolina += gasolina;
                contGasolina++;
                cont++;
            }else if (combustivel == 3) {
                System.out.print("Qtd litros: ");
                float diesel = scanner.nextFloat();
                quantDiesel += diesel;
                contDiesel++;
                cont++;
            }else {
                System.out.print("Informacao invalida.");
            }
        }

        int tamanhoLinha = 40;
        String linhaHifen =  "-".repeat(tamanhoLinha);


        System.out.println(linhaHifen);
        System.out.println("1. Álcool: " + contAlcool + " Qtd Litros: " + quantAlcool);
        System.out.println(linhaHifen);
        System.out.println("2. Gasolina: " + contGasolina + " Qtd Litros: " + quantGasolina);
        System.out.println(linhaHifen);
        System.out.println("3. Diesel: " + contDiesel + " Qtd Litros: " + quantDiesel);
        System.out.println(linhaHifen);
    }
}
