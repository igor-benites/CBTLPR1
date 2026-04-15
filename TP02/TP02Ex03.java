import java.util.Scanner;

/*
 * Enunciado: Entrar via teclado com "N" valores quaisquer. N deve ser positivo e menor que 20.
 * Exibir maior, menor, soma, média, % de positivos e % de negativos.
 * Perguntar se deseja nova execução (S ou N).
 * Nome: Igor Flores
 */

public class TP02Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            int n;
            do {
                System.out.print("Quantos valores deseja digitar? (entre 1 e 19): ");
                n = sc.nextInt();
                if (n <= 0 || n >= 20) {
                    System.out.println("Erro: quantidade deve ser positiva e menor que 20.");
                }
            } while (n <= 0 || n >= 20);

            double[] valores = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                valores[i] = sc.nextDouble();
            }

            double maior = valores[0];
            double menor = valores[0];
            double soma = 0;
            int qtdPositivos = 0;
            int qtdNegativos = 0;

            for (int i = 0; i < n; i++) {
                if (valores[i] > maior) maior = valores[i];
                if (valores[i] < menor) menor = valores[i];
                soma += valores[i];
                if (valores[i] > 0) qtdPositivos++;
                if (valores[i] < 0) qtdNegativos++;
            }

            double media = soma / n;
            double pctPositivos = (double) qtdPositivos / n * 100;
            double pctNegativos = (double) qtdNegativos / n * 100;

            System.out.println("\n--- Resultados ---");
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.printf("Soma: %.2f%n", soma);
            System.out.printf("Media: %.2f%n", media);
            System.out.printf("Porcentagem de positivos: %.2f%%%n", pctPositivos);
            System.out.printf("Porcentagem de negativos: %.2f%%%n", pctNegativos);

            do {
                System.out.print("\nDeseja nova execucao? (S/N): ");
                continuar = sc.next().toUpperCase();
                if (!continuar.equals("S") && !continuar.equals("N")) {
                    System.out.println("Resposta invalida. Digite apenas S ou N.");
                }
            } while (!continuar.equals("S") && !continuar.equals("N"));

        } while (continuar.equals("S"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
