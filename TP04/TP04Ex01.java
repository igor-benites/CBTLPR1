import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

/*
 * Enunciado: Criar a classe Data com atributos dia, mes e ano. Implementar construtores,
 * metodos de entrada com e sem parametro, metodos de retorno, formatacao da data,
 * verificacao de ano bissexto, calculo de dias transcorridos e exibicao da data atual.
 * Nome: Igor Flores
 */

public class TP04Ex01 {

    private int dia;
    private int mes;
    private int ano;

    // Construtor sem argumentos: le os valores do teclado com validacao
    public TP04Ex01() {
        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.print("Digite o ano: ");
                ano = Integer.parseInt(sc.nextLine().trim());
                if (ano <= 0)
                    System.out.println("Ano invalido, tente novamente.");
            } while (ano <= 0);

            do {
                System.out.print("Digite o mes (1-12): ");
                mes = Integer.parseInt(sc.nextLine().trim());
                if (mes < 1 || mes > 12)
                    System.out.println("Mes invalido, tente novamente.");
            } while (mes < 1 || mes > 12);

            int maxDia = diasNoMes(mes, ano);
            do {
                System.out.print("Digite o dia (1-" + maxDia + "): ");
                dia = Integer.parseInt(sc.nextLine().trim());
                if (dia < 1 || dia > maxDia)
                    System.out.println("Dia invalido, tente novamente.");
            } while (dia < 1 || dia > maxDia);

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Data definida como 01/01/2000.");
            dia = 1;
            mes = 1;
            ano = 2000;
        }
    }

    // Construtor com argumentos
    public TP04Ex01(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    // Setters com parametro
    public void entraDia(int d) {
        dia = d;
    }

    public void entraMes(int m) {
        mes = m;
    }

    public void entraAno(int a) {
        ano = a;
    }

    // Setters sem parametro: leem do teclado com validacao
    public void entraDia() {
        Scanner sc = new Scanner(System.in);
        try {
            int maxDia = diasNoMes(mes, ano);
            do {
                System.out.print("Digite o dia (1-" + maxDia + "): ");
                dia = Integer.parseInt(sc.nextLine().trim());
                if (dia < 1 || dia > maxDia)
                    System.out.println("Dia invalido, tente novamente.");
            } while (dia < 1 || dia > maxDia);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Dia nao alterado.");
        }
    }

    public void entraMes() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Digite o mes (1-12): ");
                mes = Integer.parseInt(sc.nextLine().trim());
                if (mes < 1 || mes > 12)
                    System.out.println("Mes invalido, tente novamente.");
            } while (mes < 1 || mes > 12);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Mes nao alterado.");
        }
    }

    public void entraAno() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Digite o ano: ");
                ano = Integer.parseInt(sc.nextLine().trim());
                if (ano <= 0)
                    System.out.println("Ano invalido, tente novamente.");
            } while (ano <= 0);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Ano nao alterado.");
        }
    }

    // Getters
    public int retDia() {
        return dia;
    }

    public int retMes() {
        return mes;
    }

    public int retAno() {
        return ano;
    }

    // Retorna a data no formato dd/mm/aaaa
    public String mostra1() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    // Retorna a data no formato dd/mesPorExtenso/ano
    public String mostra2() {
        String[] nomesMeses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        String nomeMes = (mes >= 1 && mes <= 12) ? nomesMeses[mes - 1] : "MesInvalido";
        return String.format("%02d/%s/%d", dia, nomeMes, ano);
    }

    // Verifica se o ano da data e bissexto
    public boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Retorna a quantidade de dias transcorridos no ano até a data
    public int diasTranscorridos() {
        int total = 0;
        for (int m = 1; m < mes; m++) {
            total += diasNoMes(m, ano);
        }
        total += dia;
        return total;
    }

    // Imprime a data atual do sistema usando Date e DateFormat
    public void apresentaDataAtual() {
        Date hoje = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(hoje));
    }

    // Metodo auxiliar: retorna a quantidade de dias de um mes, considerando ano bissexto
    private int diasNoMes(int m, int a) {
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                boolean bis = (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
                return bis ? 29 : 28;
            default:
                return 31;
        }
    }
}
