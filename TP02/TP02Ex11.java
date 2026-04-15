import java.util.Scanner;

/*
 * Enunciado: Entrar com uma matriz quadrada de ordem MxM (máximo 10x10).
 * Calcular e exibir o determinante da matriz.
 * Nome: Igor Flores
 */

public class TP02Ex11 {

    public static double calcularDeterminante(double[][] mat, int n) {
        if (n == 1) return mat[0][0];
        if (n == 2) return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];

        double det = 0;
        double[][] subMat = new double[n - 1][n - 1];

        for (int col = 0; col < n; col++) {
            int si = 0;
            for (int i = 1; i < n; i++) {
                int sj = 0;
                for (int j = 0; j < n; j++) {
                    if (j == col) continue;
                    subMat[si][sj] = mat[i][j];
                    sj++;
                }
                si++;
            }
            double sinal = (col % 2 == 0) ? 1 : -1;
            det += sinal * mat[0][col] * calcularDeterminante(subMat, n - 1);
        }

        return det;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m;
        do {
            System.out.print("Digite a ordem da matriz quadrada (1 a 10): ");
            m = sc.nextInt();
            if (m < 1 || m > 10) System.out.println("Valor invalido.");
        } while (m < 1 || m > 10);

        double[][] matriz = new double[m][m];

        System.out.println("Digite os elementos da matriz " + m + "x" + m + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nMatriz " + m + "x" + m + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%10.4f", matriz[i][j]);
            }
            System.out.println();
        }

        double det = calcularDeterminante(matriz, m);
        System.out.printf("%nDeterminante: %.4f%n", det);

        sc.close();
    }
}
