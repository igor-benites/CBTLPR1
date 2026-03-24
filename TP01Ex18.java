/*
 * Enunciado: Entrar via teclado com o valor de cinco produtos. Após as entradas,
 * digitar um valor referente ao pagamento da somatória destes valores.
 * Calcular e exibir o troco que deverá ser devolvido.
 * Aluno: Igor Flores
 */

import java.util.Scanner;

public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do produto 1: R$ ");
        double p1 = sc.nextDouble();

        System.out.print("Valor do produto 2: R$ ");
        double p2 = sc.nextDouble();

        System.out.print("Valor do produto 3: R$ ");
        double p3 = sc.nextDouble();

        System.out.print("Valor do produto 4: R$ ");
        double p4 = sc.nextDouble();

        System.out.print("Valor do produto 5: R$ ");
        double p5 = sc.nextDouble();

        double total = p1 + p2 + p3 + p4 + p5;
        System.out.printf("Total: R$ %.2f%n", total);

        System.out.print("Valor pago: R$ ");
        double pagamento = sc.nextDouble();

        double troco = pagamento - total;

        if (troco >= 0) {
            System.out.printf("Troco: R$ %.2f%n", troco);
        } else {
            System.out.printf("Valor insuficiente. Faltam R$ %.2f%n", Math.abs(troco));
        }

        sc.close();
    }
}
