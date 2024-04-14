import java.sql.Struct;
import java.util.Scanner;

public class ex25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário que informe os requisitos do trabalho
        System.out.print("Informe os requisitos do trabalho:");
        System.out.print("Interface Gráfica (0 ou 1):");
        int interfaceGrafica = scanner.nextInt();
        System.out.print("Inteligência Artificial (0 ou 1):");
        int inteligenciaArtificial = scanner.nextInt();
        System.out.print("Encapsulamento (0 ou 1):");
        int encapsulamento = scanner.nextInt();
        System.out.print("Indentação (0 ou 1):");
        int indentacao = scanner.nextInt();
        System.out.print("Structs (0 ou 1):");
        int structs = scanner.nextInt();

        // Verifica se o trabalho atendeu a todos os requisitos mínimos
        if ((interfaceGrafica == 1 || inteligenciaArtificial == 1) && encapsulamento == 0 && indentacao == 0 && structs == 0) {
            System.out.println("AVALIADO 1.");
        }else if ((encapsulamento == 1 && indentacao == 1 ) &&interfaceGrafica == 0 && inteligenciaArtificial == 0 && structs == 0) {
            System.out.println("AVALIADO 2.");
        }else if (structs == 1 && (inteligenciaArtificial == 0 && interfaceGrafica == 0 && encapsulamento == 0 && indentacao == 0)) {
            System.out.println("AVALIADO 3.");
        }else if (interfaceGrafica == 1 && inteligenciaArtificial == 1 && encapsulamento == 1 && indentacao == 1 && structs == 1) {
            System.out.println("AVALIADO 4.");
        }else {
            System.out.println(0 + " zero.");
        }
    }
}
