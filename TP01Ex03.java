/*
 * Enunciado: Calcular e exibir a área de um quadrado a partir do
 * valor de sua diagonal que será digitado.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diagonal do quadrado: ");
        double diagonal = sc.nextDouble();

        double area = (diagonal * diagonal) / 2;

        System.out.printf("Área do quadrado: %.2f%n", area);

        sc.close();
    }
}
