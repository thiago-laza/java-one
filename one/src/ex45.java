import java.text.DecimalFormat;
import java.util.Scanner;

public class ex45 {
    public static void main(String[] args){
        //Criando um objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        float maiorIdade = Float.MIN_VALUE;
        float menorIdade = Float.MAX_VALUE;
        String menorIdadeNome = "";
        float acuIdade = 0;
        for (int i = 1; i <= 5; i++){
            System.out.print("Nome da " + i + "⁰ pessoa: ");
            String nome = scanner.nextLine();
            System.out.print("Idade da " + i + "⁰ pessoa: ");
            float idade = scanner.nextFloat();
            acuIdade += idade;
            scanner.nextLine();

            if (maiorIdade < idade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdadeNome = nome;
                menorIdade = idade;
            }
        }
        DecimalFormat df = new DecimalFormat("0");
        System.out.println("Maior idade: " + df.format(maiorIdade));
        System.out.println("Nome da pessoa mais nova: " + menorIdadeNome);
        float mediaIdades = acuIdade / 5;
        System.out.println("Media das idades: " + mediaIdades);
    }
}
