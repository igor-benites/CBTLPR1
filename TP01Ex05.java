/*
 * Enunciado: Calcular e exibir o volume de uma esfera a partir do
 * valor de seu diâmetro que será digitado.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diâmetro da esfera: ");
        double diametro = sc.nextDouble();

        double raio = diametro / 2;
        double volume = (4.0 / 3.0) * Math.PI * raio * raio * raio;

        System.out.printf("Volume da esfera: %.2f%n", volume);

        sc.close();
    }
}
