import java.util.Scanner;

public class ex12 {
    //Neste problema, você deverá ler 3 palavras que definem o tipo de animal
    //possível segundo o esquema abaixo, da esquerda para a direita. Em seguida
    //conclua qual dos animais seguintes foi escolhido, através das três palavras
    //fornecidas.
    public static void main(String[] args){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);


        //Criando um objeto scanner para obter as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        System.out.print("Escolha a opcao: vertebrado ou invertebrado? ");
        String opv1 = scanner.next();
        //Verificando as condicoes
        if (opv1.equals("vertebrado")){
            System.out.print("Escolha a opcao: ave ou mamifero? ");
            String opv2 = scanner.next();
            if(opv2.equals("ave")){
                System.out.print("Escolha a opcao: carnivoro ou onivoro? ");
                String opv3 = scanner.next();
                if (opv3.equals("carnivoro")){
                    System.out.println(linhaHifen);
                    System.out.println("aguia");
                    System.out.println(linhaHifen);
                } else if (opv3.equals("onivoro")) {
                    System.out.println(linhaHifen);
                    System.out.println("pomba");
                    System.out.println(linhaHifen);
                }
            } else if (opv2.equals("mamifero")) {
                System.out.print("Escolha a opcao: onivoro ou herbivoro?");
                String opv3 = scanner.next();
                if (opv3.equals("onivoro")){
                    System.out.println(linhaHifen);
                    System.out.println("homem");
                    System.out.println(linhaHifen);
                }else if (opv3.equals("herbivoro")){
                    System.out.println(linhaHifen);
                    System.out.println("vaca");
                    System.out.println(linhaHifen);
                }
            }
        } else if (opv1.equals("invertebrado")) {
            System.out.print("Escolha uma opcao: inseto ou anelideo? ");
            String opv2 = scanner.next();
            if (opv2.equals("inseto")){
                System.out.print("Escolha uma opcao: hematofago ou herbivoro? ");
                String opv3 = scanner.next();
                if (opv3.equals("hematofago")){
                    System.out.println(linhaHifen);
                    System.out.println("pulga");
                    System.out.println(linhaHifen);
                } else if (opv3.equals("herbivoro")) {
                    System.out.println(linhaHifen);
                    System.out.println("lagarta");
                    System.out.println(linhaHifen);
                }
            } else if (opv2.equals("anelideo")) {
                System.out.print("Escolha uma opcao: hematofago ou onivoro? ");
                String opv3 = scanner.next();
                if (opv3.equals("hematofago")){
                    System.out.println(linhaHifen);
                    System.out.println("sanguessuga");
                    System.out.println(linhaHifen);
                } else if (opv3.equals("onivoro")) {
                    System.out.println(linhaHifen);
                    System.out.println("minhoca");
                    System.out.println(linhaHifen);
                }
            }
        }
    }
}
