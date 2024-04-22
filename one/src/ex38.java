import java.util.Scanner;

public class ex38 {
    public static void main(String []args){
        //Criando um objeto scanner para a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        //Recebendo a entrada do usuario
        System.out.print("Digite um numero para saber se ele e primo: ");
        int numero = scanner.nextInt();
        //Fazendo a verificacao
        int cont = 0;
        for(int i = 1; i <= numero; i++){
            if (numero % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println(numero + " e primo.");
        }else{
            System.out.println(numero + " nao e primo.");
        }
    }
}
