/*
 * Enunciado: Entrar via teclado com a base e a altura de um retângulo,
 * calcular e exibir sua área.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.printf("Área do retângulo: %.2f%n", area);

        sc.close();
    }
}
