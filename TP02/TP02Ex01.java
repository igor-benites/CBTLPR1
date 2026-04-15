import java.util.Scanner;

/*
 * Enunciado: Entrar com dois valores via teclado, onde o segundo valor deverá ser maior
 * que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.
 * Nome: Igor Flores
 */

public class TP02Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int v1 = sc.nextInt();

        int v2;
        do {
            System.out.print("Digite o segundo valor (deve ser maior que " + v1 + "): ");
            v2 = sc.nextInt();
            if (v2 <= v1) {
                System.out.println("Erro: o segundo valor precisa ser maior que o primeiro. Tente novamente.");
            }
        } while (v2 <= v1);

        System.out.println("Valores digitados: " + v1 + " e " + v2);
        sc.close();
    }
}
