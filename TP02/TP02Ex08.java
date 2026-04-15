import java.util.Scanner;

/*
 * Enunciado: Entrar via teclado com doze valores em uma matriz 3x4. Solicitar uma constante
 * multiplicativa e armazenar o resultado em outra matriz de mesma ordem. Exibir as duas matrizes.
 * Nome: Igor Flores
 */

public class TP02Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizA = new int[3][4];
        int[][] matrizB = new int[3][4];

        System.out.println("Digite os 12 valores para a matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nDigite a constante multiplicativa: ");
        int constante = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = matrizA[i][j] * constante;
            }
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz resultante (multiplicada por " + constante + "):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
