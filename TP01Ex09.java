/*
 * Enunciado: Calcular e exibir a tensão de um determinado circuito eletrônico
 * a partir dos valores da resistência e corrente elétrica que serão digitados.
 * Utilizar a lei de Ohm.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Resistência (Ω): ");
        double resistencia = sc.nextDouble();

        System.out.print("Corrente elétrica (A): ");
        double corrente = sc.nextDouble();

        double tensao = resistencia * corrente;

        System.out.printf("Tensão (V): %.2f%n", tensao);

        sc.close();
    }
}
