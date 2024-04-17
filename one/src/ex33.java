import java.util.Scanner;

public class ex33 {
    public static void main(String[] args){
        //Criando um objeto scanner para a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        //Recebendo a entrada do usuario e exibindo o resultado.
        System.out.println("Digite um numero inteiro positivo: ");
        int n = scanner.nextInt();

        int inicioLinha = 1;
        for (int i = 0; i < n; i++){
            System.out.println(inicioLinha + " " + (inicioLinha + 1) + " " + (inicioLinha + 2) + " PUM");
            inicioLinha += 4;
        }
    }
}
//duvida