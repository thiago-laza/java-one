import java.util.Scanner;

public class ex39 {
    public static void main(String[] args){
        //Criando um objeto scanner para obter a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo a entrada do usuario
        System.out.print("Digite um numero para obter a sua tabuada: ");
        int numero = scanner.nextInt();
        //Fazendo a construcao da tabuada
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
}
