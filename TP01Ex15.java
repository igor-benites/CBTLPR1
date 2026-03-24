/*
 * Enunciado: Entrar via teclado com o valor da cotação do dólar e uma certa
 * quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cotação do dólar (R$): ");
        double cotacao = sc.nextDouble();

        System.out.print("Quantidade em dólares (US$): ");
        double dolares = sc.nextDouble();

        double reais = dolares * cotacao;

        System.out.printf("US$ %.2f = R$ %.2f%n", dolares, reais);

        sc.close();
    }
}
