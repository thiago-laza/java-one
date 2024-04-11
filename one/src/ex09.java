import java.text.DecimalFormat;
import java.util.Scanner;

public class ex09 {
    //Faça um programa que receba via teclado o tempo de duração de um evento em
    //uma fábrica em uma a variável do tipo inteira (int) expressa em segundos e mostre-o
    //expresso em horas, minutos e segundos.
    public static void main(String[] args){
        int tamanhoLinha = 35;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Criando um objeto scanner para receber as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo a entrada do usuario
        System.out.print("Informe o tempo em segundo: ");
        int tempo = scanner.nextInt();
        //Fazendo a conversao para horas, minutos e segundos
        int tempoHora = tempo / 3600;
        int tempoMinuto = (tempo - (tempoHora * 3600)) / 60;
        int tempoSegundo = (tempo - (tempoHora * 3600 + tempoMinuto * 60));
        //Exibindo o resultado
        DecimalFormat df = new DecimalFormat("00");
        System.out.println(linhaHifen);
        System.out.println("HH:MM:SS = " + df.format(tempoHora) + ":" + df.format(tempoMinuto) + ":" + df.format(tempoSegundo));
        System.out.println(linhaHifen);

    }
}
