import java.util.Scanner;

public class ex30 {
    /*Leia um conjunto 3 (três) pares de valores M e N. Para cada par lido, mostre a
    sequência do menor até o maior e a soma dos inteiros consecutivos entre eles
    (incluindo o N e M). */
    public static void main(String[] args){
        //Criando um objeo scanner para obter as entradas do usuraio
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        for (int i = 1; i <= 3; i++){
            System.out.println("Digite o " + i + "⁰ par:");
            System.out.print("M: ");
            int p1 = scanner.nextInt();
            System.out.print("N: ");
            int p2 = scanner.nextInt();
            
            if (p1 < p2) {
                int soma = 0;
                while (p1 <= p2) {
                System.out.print(p1 + " ");
                    soma+=p1;
                    p1++;
                }
                System.out.println();
                System.out.println("Soma: " + soma);
            }else if (p2 < p1) {
                int soma = 0;
                while (p2 <= p1) {
                    System.out.print(p2 + " ");
                    soma+=p2;
                    p2++;
                }
                System.out.println();
                System.out.println("Soma: " + soma);
            }
        }
    }
}
