import java.util.Scanner;

public class ex41 {
    public static void main(String[] args){
        //Criando um objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        //Verificando as condicoes
        if (altura <= 1.5) {
            if (peso < 50) {
                double pesoIdeal = 50 - peso;
                System.out.println("Engordar " + pesoIdeal + " kg");
            }else if (peso == 50) {
                System.out.println("Parabens, peso ideal");
            }else{
                double pesoIdeal = peso - 50;
                System.out.println("Emagrecer " + pesoIdeal + " kg");
            }
        }else if (altura <= 1.90) {
            if (peso < 70) {
                double pesoIdeal = 70 - peso;
                System.out.println("Engordar " + pesoIdeal + " kg");
            }else if (peso == 70) {
                System.out.println("Parabens, peso ideal");
            }else{
                double pesoIdeal = peso - 70;
                System.out.println("Emagrecer " + pesoIdeal + " kg");
            }
        }else {
            if (peso < 100) {
                double pesoIdeal = 100 - peso;
                System.out.println("Engordar " + pesoIdeal + " kg");
            }else if (peso == 100) {
                System.out.println("Parabens, peso ideal");
            }else {
                double pesoIdeal = peso - 100;
                System.out.println("Emagrecer " + pesoIdeal + " kg");
            }
        }
    }
}
