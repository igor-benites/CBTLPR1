/*
 * Enunciado: Calcular e exibir a média aritmética de quatro valores
 * quaisquer que serão digitados.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1º valor: ");
        double v1 = sc.nextDouble();

        System.out.print("2º valor: ");
        double v2 = sc.nextDouble();

        System.out.print("3º valor: ");
        double v3 = sc.nextDouble();

        System.out.print("4º valor: ");
        double v4 = sc.nextDouble();

        double media = (v1 + v2 + v3 + v4) / 4;

        System.out.printf("Média aritmética: %.2f%n", media);

        sc.close();
    }
}
