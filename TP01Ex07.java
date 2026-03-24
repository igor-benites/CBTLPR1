/*
 * Enunciado: Calcular e exibir a média geométrica de dois valores
 * quaisquer que serão digitados.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1º valor: ");
        double v1 = sc.nextDouble();

        System.out.print("2º valor: ");
        double v2 = sc.nextDouble();

        double mediaGeo = Math.sqrt(v1 * v2);

        System.out.printf("Média geométrica: %.2f%n", mediaGeo);

        sc.close();
    }
}
