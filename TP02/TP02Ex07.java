import java.util.Scanner;

/*
 * Enunciado: Entrar via teclado com doze valores em uma matriz 3x4. Solicitar uma constante
 * multiplicativa e multiplicar cada elemento, armazenando o resultado na própria matriz.
 * Nome: Igor Flores
 */

public class TP02Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        System.out.println("Digite os 12 valores para a matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nDigite a constante multiplicativa: ");
        int constante = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= constante;
            }
        }

        System.out.println("\nMatriz apos a multiplicacao:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
