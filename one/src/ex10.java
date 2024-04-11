import java.util.Scanner;

public class ex10 {
    //Faça um programa que receba via teclado o tempo de duração de um evento em
    //uma fábrica em uma a variável do tipo inteira (int) expressa em segundos e mostre-o
    //expresso em horas, minutos e segundos.
    public static void main(String[] args){
        int tamanhoLinha =30;
        String linhaHifen = "-".repeat(tamanhoLinha);
        //Criando um objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        System.out.print("Informe sua idade em dias: ");
        int tempo = scanner.nextInt();
        //Fazendo a conversao para anos, meses e dias.
        int tempoAno = tempo / 365;
        int tempoMes = (tempo - (tempoAno * 365)) / 30;
        int tempoDias = (tempo - (tempoAno * 365 + tempoMes * 30));
        System.out.println(linhaHifen);
        System.out.println(tempoAno + " ano(s)");
        System.out.println(tempoMes + " mes(es)");
        System.out.println(tempoDias + " dia(s)");
        System.out.println(linhaHifen);
    }
}
