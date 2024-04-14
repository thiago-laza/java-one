import java.util.Scanner;

public class ex26 {
    public static void main(String[] args){
        /*
         Nos parques de diversão, alguns brinquedos têm idade e altura mínimas para
        poder andar neles. O parque UNINASSAU possui 3 brinquedos que possuem essa
        limitação:
        Barca Viking: 1,5m de altura e 12 anos.
        Elevator of Death: 1,4m de altura e 14 anos.
        Final Killer: 1,7m de altura ou 16 anos. 
        Dada a altura e a idade de uma pessoa, faça um programa que identifique quantos
        brinquedos ele pode andar.
         */

        //Criando um objeto scanner para as entradas dos usuario
        Scanner scanner = new Scanner(System.in);
        
        //Recebendo as entradas do usuario
        System.out.print("Altura: ");
        float altura = scanner.nextFloat();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        
        //Verificando as condicoes
        int cont = 0;
        if (altura >= 1.5 && idade >= 12) {
            cont++;
        }
        if (altura >= 1.4 && idade >= 14) {
            cont++;
        }
        if (altura >= 1.7 && idade >= 16) {
            cont++;
        }
        System.out.println(cont + " brinquedos.");
    }
}
