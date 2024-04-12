import java.util.Scanner;

public class ex17 {
    //Na matemática, um Número Primo é aquele que pode ser dividido somente por 1
    //(um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido
    //apenas pelo número 1 e pelo número 7.
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo a entrada do usuario
        System.out.print("Escreva um numero: ");
        int numero = scanner.nextInt();
        //Verificando se o numero e ou nao primo
        int cont = 0;
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                cont++;
            }
        }if (cont == 2){
            System.out.println(numero + " e primo.");
        }else {
            System.out.println(numero + " nao e primo.");
        }
    }
}
