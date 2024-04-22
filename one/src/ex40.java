import java.util.Scanner;

public class ex40 {
    public static void main(String[] args){
        //Criando um objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas dos usuario
        System.out.print("Medida 1: ");
        int lado1 = scanner.nextInt();
        System.out.print("Medida 2: ");
        int lado2 = scanner.nextInt();
        System.out.print("Medida 3: ");
        int lado3 = scanner.nextInt();
        //Verificando a condicao de existencia do triangulo
        if ((lado1 > lado2 + lado3) || (lado2 > lado1 + lado3) || (lado3 > lado1 + lado2)) {
            System.out.println("Nao forma um triangulo.");
        }else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilatero");
            }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)  {
                System.out.println("Isosceles");
            }else {
                System.out.println("Escaleno");
            }
        }
    }
}
