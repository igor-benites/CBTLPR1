import java.util.Scanner;

/*
 * Enunciado: Entrar com uma matriz de ordem MxN (máximo 10x10). Após a digitação,
 * calcular e exibir a matriz transposta.
 * Nome: Igor Flores
 */

public class TP02Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;

        do {
            System.out.print("Digite o numero de linhas (1 a 10): ");
            m = sc.nextInt();
            if (m < 1 || m > 10) System.out.println("Valor invalido.");
        } while (m < 1 || m > 10);

        do {
            System.out.print("Digite o numero de colunas (1 a 10): ");
            n = sc.nextInt();
            if (n < 1 || n > 10) System.out.println("Valor invalido.");
        } while (n < 1 || n > 10);

        double[][] matriz = new double[m][n];

        System.out.println("Digite os elementos da matriz " + m + "x" + n + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        double[][] transposta = new double[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz original (" + m + "x" + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%8.2f", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz transposta (" + n + "x" + m + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%8.2f", transposta[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
