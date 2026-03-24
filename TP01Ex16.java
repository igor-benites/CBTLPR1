/*
 * Enunciado: Entrar via teclado com o valor de um ângulo em graus, calcular
 * e exibir as seguintes funções trigonométricas: seno, cosseno, tangente e
 * secante deste ângulo.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ângulo em graus: ");
        double graus = sc.nextDouble();

        double radianos = Math.toRadians(graus);

        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);
        double secante = 1.0 / cosseno;

        System.out.printf("Seno:     %.4f%n", seno);
        System.out.printf("Cosseno:  %.4f%n", cosseno);
        System.out.printf("Tangente: %.4f%n", tangente);
        System.out.printf("Secante:  %.4f%n", secante);

        sc.close();
    }
}
