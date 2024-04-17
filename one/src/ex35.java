public class ex35 {
    public static void main(String[] args){
        float soma = 0;
        float denominador = 1;
        for (int numerador = 1; numerador <= 39; numerador += 2){
            soma += (float) numerador / denominador;
            denominador *= 2;
        }
        System.out.println(soma);
    }
}
