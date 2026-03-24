/*
 * Enunciado: Calcular e exibir o volume de um cone a partir dos valores
 * da altura e do raio da base que serão digitados.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio da base do cone: ");
        double raio = sc.nextDouble();

        System.out.print("Altura do cone: ");
        double altura = sc.nextDouble();

        double volume = (Math.PI * raio * raio * altura) / 3;

        System.out.printf("Volume do cone: %.2f%n", volume);

        sc.close();
    }
}
