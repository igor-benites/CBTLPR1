/*
 * Enunciado: A partir dos valores da base e altura de um triângulo,
 * calcular e exibir sua área.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do triângulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura do triângulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("Área do triângulo: %.2f%n", area);

        sc.close();
    }
}
