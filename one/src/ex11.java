import java.util.Scanner;

public class ex11 {
    //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
    //sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma
    //duração mínima de 1 hora e máxima de 24 horas.
    public static void main(String[] args){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);
        //Criando objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        System.out.print("Inicio: ");
        int inicio = scanner.nextInt();
        System.out.print("Fim: ");
        int fim = scanner.nextInt();
       //Analisando as condicoes
        if (inicio < fim){
            int duracao = fim - inicio;
            System.out.println("O jogo durou " + duracao + " hora(s).");
        }else if (fim < inicio){
            int duracao = (24 - inicio) + fim;
            System.out.println("O jogo durou " + duracao + " hora(s).");
        } else if (fim == inicio) {
            int duracao = 24;
            System.out.println("O jogo durou " + duracao + " hora(s).");
        }
    }
}
