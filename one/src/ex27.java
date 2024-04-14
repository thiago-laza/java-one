import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex27 {
    public static void main(String[] args){
        /*Genival tem muito medo de ter diabetes e, por isso, o médico pediu que ele
        medisse sua glicose ao longo do dia para ver se ela estava controlada. Escreva um
        programa que receba como entrada 4 quatro medições dos valores da taxa de
        glicose de Genival, para cada valor informado informe NORMAL ou ALTERADA e ao
        final calcule a glicose média observada naquele dia.
        Caso esse valor seja inferior a 110, o programa deve exibir a mensagem NORMAL,
        se tiver entre 110 e 125 exibir a mensagem ALTERADA, acima de 125, a mensagem
        exibida deve ser MUITO ALTA.
        Entrada
        Quatro valores inteiros representando o resultado das medições feitas no dia. 
        Saída
        Uma das seguintes mensagens: NORMAL, ALTERADA ou MUITO ALTA e o valor
        médio das medições ao final do processamento.*/

        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Criando um objeto scanner para as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        int acu = 0;
        int cont = 1;
        while (cont <= 4) {
            System.out.print("Medicao " + cont + ": ");
            int medicao = scanner.nextInt();
            acu+=medicao;
            cont++;
            if (medicao < 110) {
                System.out.println(linhaHifen);
                System.out.println(medicao + " Normal.");
                System.out.println(linhaHifen);
            }else if (medicao < 125) {
                System.out.println(linhaHifen);
                System.out.println(medicao + " Alterada.");
                System.out.println(linhaHifen);
            }else{
                System.out.println(linhaHifen);
                System.out.println(medicao + " Muito alta.");
                System.out.println(linhaHifen);
            }

        }
        float media = (float) acu / (cont - 1);
        System.out.println(linhaHifen);
        System.out.println("Media das leituras: " + media);
        System.out.println(linhaHifen);
        
        
    }
}
