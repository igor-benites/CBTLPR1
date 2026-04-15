import java.util.Scanner;

/*
 * Enunciado: Entrar via teclado com dez valores positivos. Consistir a digitação e enviar
 * mensagem de erro, se necessário. Após a digitação, exibir: maior valor, soma e média aritmética.
 * Nome: Igor Flores
 */

public class TP02Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];

        for (int i = 0; i < 10; i++) {
            do {
                System.out.print("Digite o " + (i + 1) + "° valor positivo: ");
                valores[i] = sc.nextInt();
                if (valores[i] <= 0) {
                    System.out.println("Erro: o valor deve ser positivo.");
                }
            } while (valores[i] <= 0);
        }

        int maior = valores[0];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            soma += valores[i];
        }

        double media = (double) soma / 10;

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Soma: " + soma);
        System.out.printf("Media: %.2f%n", media);

        sc.close();
    }
}
