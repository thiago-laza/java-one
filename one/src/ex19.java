import java.text.DecimalFormat;
import java.util.Scanner;

public class ex19 {
    //Devido à proximidade com o Dia do Trabalho, uma empresa resolveu conceder
    //aumentos salariais a seus funcionários. Aqueles com salário superior a R$ 500,
    //terão aumento de 10%, enquanto os que ganham mais de R$ 300 terão aumento de
    //7%. Os demais funcionários terão aumento de apenas 5%. Escreva um programa
    //que receba como entrada o salário atual de um funcionário, calcule e exiba o valor
    //de seu novo salário já com o aumento concedido.
    public static void main(String[] args){
        //Criando um objeto scanner para receber a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        //Recebendo a entrada do usuario
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();
        //Verificando faixas de aumentos
        DecimalFormat df = new DecimalFormat("0.00");
        if (salario > 500){
            salario = salario * 1.1;
            System.out.println(df.format(salario));
        } else if (salario > 300) {
            salario = salario * 1.07;
            System.out.println(df.format(salario));
        }else {
            salario = salario * 1.05;
            System.out.println(df.format(salario));
        }
    }
}
