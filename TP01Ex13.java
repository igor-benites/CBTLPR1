/*
 * Enunciado: Calcular e exibir a velocidade final (em km/h) de um automóvel,
 * a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s²) e
 * do tempo de percurso (em s) que serão digitados.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Velocidade inicial (m/s): ");
        double vi = sc.nextDouble();

        System.out.print("Aceleração (m/s²): ");
        double aceleracao = sc.nextDouble();

        System.out.print("Tempo (s): ");
        double tempo = sc.nextDouble();

        double vfMs = vi + (aceleracao * tempo);
        double vfKmh = vfMs * 3.6;

        System.out.printf("Velocidade final: %.2f km/h%n", vfKmh);

        sc.close();
    }
}
