/*
 * Enunciado: Sabendo que uma milha marítima equivale a um mil, oitocentos
 * e cinquenta e dois metros e que um quilômetro possui mil metros, fazer um
 * programa para converter milhas marítimas em quilômetros.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Milhas marítimas: ");
        double milhas = sc.nextDouble();

        double km = milhas * 1.852;

        System.out.printf("%.2f milha(s) marítima(s) = %.3f km%n", milhas, km);

        sc.close();
    }
}
