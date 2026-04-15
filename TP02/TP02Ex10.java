import java.util.Scanner;

/*
 * Enunciado: Entrar com uma matriz quadrada de ordem MxM (máximo 10x10).
 * Calcular e exibir a matriz inversa pelo método de Gauss-Jordan.
 * Nome: Igor Flores
 */

public class TP02Ex10 {
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

        // Cria a matriz aumentada [A | I]
        double[][] aumentada = new double[m][2 * m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                aumentada[i][j] = matriz[i][j];
            }
            aumentada[i][m + i] = 1;
        }

        // Eliminação de Gauss-Jordan
        for (int col = 0; col < m; col++) {
            // Busca pivô
            int pivo = -1;
            for (int linha = col; linha < m; linha++) {
                if (Math.abs(aumentada[linha][col]) > 1e-10) {
                    pivo = linha;
                    break;
                }
            }

            if (pivo == -1) {
                System.out.println("Matriz singular, nao possui inversa.");
                sc.close();
                return;
            }

            // Troca linhas
            double[] temp = aumentada[col];
            aumentada[col] = aumentada[pivo];
            aumentada[pivo] = temp;

            // Normaliza linha do pivô
            double divisor = aumentada[col][col];
            for (int j = 0; j < 2 * m; j++) {
                aumentada[col][j] /= divisor;
            }

            // Zera coluna nas outras linhas
            for (int linha = 0; linha < m; linha++) {
                if (linha != col) {
                    double fator = aumentada[linha][col];
                    for (int j = 0; j < 2 * m; j++) {
                        aumentada[linha][j] -= fator * aumentada[col][j];
                    }
                }
            }
        }

        // Extrai a inversa
        double[][] inversa = new double[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                inversa[i][j] = aumentada[i][m + j];
            }
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%10.4f", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz inversa:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%10.4f", inversa[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
