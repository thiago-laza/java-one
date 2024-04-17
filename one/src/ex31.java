import java.util.Scanner;

public class ex31 {
    public static void main(String[] args){
        /*Faça um programa que leia as notas referentes às duas avaliações de um aluno.
        Calcule e imprima a média semestral. Faça com que o programa só aceita notas
        válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser
        validada separadamente.
        Entrada
        A entrada contém vários valores reais, positivos ou negativos.
        Saída
        Se uma nota inválida for lida deve ser impressa a mensagem “NOTA INVÁLIDA”.
        Quando duas notas válidas forem lidas, deve ser impressa a mensagem "MÉDIA = "
        seguido do valor do cálculo. */

        //Criando um objeto scanner para obter as entradas do usuario.
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario e verificando as condicoes
        int cont = 0;
        float acu = 0;
        while (true) {
            System.out.print("Digite uma nota 1: ");
            float nota1 = scanner.nextFloat();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota invalida.");
            }else {
                acu += nota1;
                cont++;
                break;
            }
        }
        while (true) {
            System.out.print("Digite uma nota 2: ");
            float nota1 = scanner.nextFloat();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota invalida.");
            }else {
                acu += nota1;
                cont++;
                break;
            } 
        }
        float media = acu / cont;
        System.out.println("Media: " + media);
    }
}
