/*
 * Enunciado: Entrar via teclado com o valor de uma temperatura em graus
 * Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);

        sc.close();
    }
}
