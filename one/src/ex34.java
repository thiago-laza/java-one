import java.util.Scanner;

public class ex34 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas dos usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario e as condicoes
        System.out.print("Informe o primeiro valor: ");
        int numElementosLinha = scanner.nextInt();
        System.out.print("Inforem o segundo valor: ");
        int quanElemento = scanner.nextInt();


        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);

        int cont = 0;
        System.out.println(linhaHifen);
        for (int i = numElementosLinha; i <= quanElemento; i++){
            System.out.print(i + " ");
            cont++;
            if (cont % numElementosLinha == 0) {
                System.out.println();
            }
            
        }
        System.out.println();
        System.out.println(linhaHifen);
    }
}
//duvida
