import java.text.DecimalFormat;
import java.util.Scanner;

public class ex06 {
    //Calcule o consumo médio de um automóvel sendo fornecidos a distância total
    //percorrida (em km) e o total de combustível gasto (em litros).
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //obtendo as entradas do usuario
        System.out.print("Distancia em km: ");
        int distancia = scanner.nextInt();
        System.out.print("Total de combustivel: ");
        float combustivel = scanner.nextFloat();
        //Calculando o consumo medio
        float consumoMedio = (float) distancia / combustivel;
        //Exibindo o resultado
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(consumoMedio) + " km/l");
    }
}
