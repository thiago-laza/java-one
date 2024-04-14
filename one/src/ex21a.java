import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class ex21a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> anos = new ArrayList<>();
        List<Double> velocidades = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            System.out.println("Ano do " + i + 1 + " carro: ");
            int ano = scanner.nextInt();
            anos.add(ano);

            System.out.println("Velocidade do " + i + 1 +" carro: ");
            double velocidade = scanner.nextDouble();
            velocidades.add(velocidade);
        }

        int carroNovo = anos.get(0);
        for (int ano : anos){
            if (ano > carroNovo){
                carroNovo = ano;
            }
        }

        double carroRapido = velocidades.get(0);
        for (double velocidade : velocidades){
            if (velocidade > carroRapido){
                carroRapido = velocidade;
            }
        }

        System.out.println(carroNovo);
        System.out.println(carroRapido);
    }
}
