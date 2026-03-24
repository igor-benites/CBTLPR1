/*
 * Enunciado: Calcular e exibir o volume livre de um ambiente que contém uma
 * esfera de raio "r" inscrita em um cubo perfeito de aresta "a". Os valores
 * de "r" e "a" serão digitados.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Aresta do cubo (a): ");
        double aresta = sc.nextDouble();

        System.out.print("Raio da esfera (r): ");
        double raio = sc.nextDouble();

        double volumeCubo = aresta * aresta * aresta;
        double volumeEsfera = (4.0 / 3.0) * Math.PI * raio * raio * raio;
        double volumeLivre = volumeCubo - volumeEsfera;

        System.out.printf("Volume do cubo: %.2f%n", volumeCubo);
        System.out.printf("Volume da esfera: %.2f%n", volumeEsfera);
        System.out.printf("Volume livre: %.2f%n", volumeLivre);

        sc.close();
    }
}
