/*
 * Enunciado: Calcular e exibir a área de um quadrado, a partir do
 * valor de sua aresta que será digitado.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Aresta do quadrado: ");
        double aresta = sc.nextDouble();

        double area = aresta * aresta;

        System.out.printf("Área do quadrado: %.2f%n", area);

        sc.close();
    }
}
