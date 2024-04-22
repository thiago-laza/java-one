import java.util.Scanner;

public class ex44 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario
        double acuPar = 0;
        int contPar = 0;
        double acuImpar = 0;
        int contImpar = 0;
        double maiorPar = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        
        for (int i = 1; i <= 5; i++){
            System.out.print("Informe o " + i + "⁰ valor: ");
            double numero = scanner.nextDouble();
            
            if (numero % 2 != 0) {
                acuImpar += numero;
                contImpar++;
            }else{
                if (numero > maiorPar) {
                    maiorPar = numero;
                }
            }

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            

        }
        double mediaImpares = acuImpar / contImpar;
        System.out.println("Media dos impares: " + mediaImpares);
        System.out.println("Maior numero par: " + maiorPar);
        double diferenca = maior - menor;
        System.out.println("Diferença: " + diferenca);
        
        
    }
}
