import java.util.ArrayList;
import java.util.Scanner;

public class ex43 {
    public static void main(String[] args){
        //Criando um objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Recebendo as entradas do usuario
        System.out.print("Valor da compra: ");
        int valorCompra = scanner.nextInt();
        System.out.print("Valor pago: ");
        int valorPago = scanner.nextInt();
        //Fazendo as verificacoes
        int troco = valorPago - valorCompra;
        int[] valores = {150,120,110,105,102,70,60,55,52,30,25,22,15,12,7};
        boolean encontrado = false;
        for(int valor : valores){
            if (valor == troco) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Possivel");
        }else {
            System.out.println("Impossivel");
        }
        

    }
}
