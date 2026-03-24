/*
 * Enunciado: A partir do diâmetro de um círculo que será digitado,
 * calcular e exibir sua área.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diâmetro do círculo: ");
        double diametro = sc.nextDouble();

        double raio = diametro / 2;
        double area = Math.PI * raio * raio;

        System.out.printf("Área do círculo: %.2f%n", area);

        sc.close();
    }
}
