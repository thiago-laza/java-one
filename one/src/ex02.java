import java.util.Scanner;

//Escreva um programa que leia o número de um funcionário, seu número de horas
//trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A
//seguir, mostre o número e o salário do funcionário, com duas casas decimais.
public class ex02 {
    public static void main(String[] args){
        int tamanhoLinha = 50;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Criando um objeto scanner para receber as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Solicitando a entrada e criando as variaveis
        System.out.print(linhaHifen);
        System.out.printf("Numero: ");
        String numero = scanner.next();
        System.out.print(linhaHifen);
        System.out.printf("Numero de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.print(linhaHifen);
        System.out.printf("Valor por hora trabalhada: ");
        float valorHora = scanner.nextFloat();
        //Calculando o salario mensal
        float salario = horasTrabalhadas * valorHora;
        System.out.print(linhaHifen);
        System.out.print("Numero: " + numero);
        System.out.print("Salario mensal: R$ ");
        System.out.printf("%.2f\n", salario);
        System.out.print(linhaHifen);
    }


}
