/*
 * Enunciado: Entrar via teclado com dois valores quaisquer "X" e "Y".
 * Calcular e exibir o cálculo X^Y ("X" elevado a "Y").
 * Utilizando as funções Exp e Ln.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base (X): ");
        double x = sc.nextDouble();

        System.out.print("Expoente (Y): ");
        double y = sc.nextDouble();

        double resultado = Math.exp(y * Math.log(x));

        System.out.printf("%.2f ^ %.2f = %.4f%n", x, y, resultado);

        sc.close();
    }
}
