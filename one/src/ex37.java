import java.util.Scanner;

public class ex37 {
    public static void main(String[] args){
        //Criando um objeto scanner para receber a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        //Recebendo a entrada do usuario
        System.out.print("Valor: ");
        int valor = scanner.nextInt();
        //Criando as condicoes
        for (int i = 1; i < valor; i++){
            System.out.print("HO" + " ");
        }
        System.err.print("HO!");
    }
}
