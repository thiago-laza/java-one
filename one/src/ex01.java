import java.util.Scanner;

public class ex01 {
    //Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2
    //notas de um aluno. Calcule a média ponderada do aluno, sabendo que a nota A tem
    //peso 3.5 e a nota B tem peso 7.5. A soma dos pesos é 11. Assuma que cada nota
    //pode ir de O até 10.0, sempre com uma casa.
    public static void main(String[] args){
        int tamanhoLinha = 50;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Criando um objeto Scanner para receber a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        //Solicita ao usuario as entradas
        System.out.println(linhaHifen);
        System.out.print("Digite primeira nota: ");
        float primeiraNota = scanner.nextFloat();
        System.out.println(linhaHifen);
        System.out.print("Digite a segunda nota: ");
        float segundaNota = scanner.nextFloat();
        //Calculando a media ponderada
        float media = (float) ((primeiraNota * 3.5 + segundaNota * 7.5) / 11);
        //Impriminto a media
        System.out.println(linhaHifen);
        System.out.println("A media e das notas " + primeiraNota + " e " + segundaNota + " e: " + media);
        System.out.println(linhaHifen);
    }
}
