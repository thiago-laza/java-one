import java.util.Scanner;



public class ex37 {
    public static void main(String[] args){
        //Criando um objeto scanner para receber as entradas dos usuarios
        Scanner scanner = new Scanner(System.in);
        //Recebendo as entradas dos usurarios

        //usuario1
        System.out.println("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Par ou Impar? ");
        String parOuImpar1 = scanner.nextLine();
        System.out.print("Numero: ");
        int numero1 = scanner.nextInt();
        scanner.nextLine();

        //usuario2
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Par ou Impar? ");
        String parOuImpar2 = scanner.nextLine();
        System.out.print("Numero: ");
        int numero2 = scanner.nextInt();
        scanner.nextLine();

        //verificando as condicoes
        int soma = numero1 + numero2;
        if (soma % 2 == 0  ) {
            if (parOuImpar1.equals("par")) {
                System.out.println("Vencedor: " + nome1);
            }else if (parOuImpar2.equals("par")) {
                System.out.println("Vencedor: " + nome2);
            }
        }else if (soma % 2 != 0) {
            if (parOuImpar1.equals("impar")) {
                System.out.println("Vencedor: " + nome1);
            }else if (parOuImpar2.equals("impar")) {
                System.out.println("Vencedor: " + nome2);
            }
        }
    }
}
