import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

/*
 * Exercicio 01 - Classe Data reescrita no padrao UML (Getter e Setter)
 * Nome: Igor Flores
 */

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Ano: ");
                ano = Integer.parseInt(sc.nextLine().trim());
                if (ano <= 0) System.out.println("Ano invalido.");
            } while (ano <= 0);

            do {
                System.out.print("Mes (1-12): ");
                mes = Integer.parseInt(sc.nextLine().trim());
                if (mes < 1 || mes > 12) System.out.println("Mes invalido.");
            } while (mes < 1 || mes > 12);

            int max = diasNoMes(mes, ano);
            do {
                System.out.print("Dia (1-" + max + "): ");
                dia = Integer.parseInt(sc.nextLine().trim());
                if (dia < 1 || dia > max) System.out.println("Dia invalido.");
            } while (dia < 1 || dia > max);

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Usando 01/01/2000.");
            dia = 1; mes = 1; ano = 2000;
        }
    }

    public Data(int d, int m, int a) {
        dia = d; mes = m; ano = a;
    }

    public void setDia(int d) { dia = d; }
    public void setMes(int m) { mes = m; }
    public void setAno(int a) { ano = a; }

    public void setDia() {
        Scanner sc = new Scanner(System.in);
        try {
            int max = diasNoMes(mes, ano);
            do {
                System.out.print("Dia (1-" + max + "): ");
                dia = Integer.parseInt(sc.nextLine().trim());
                if (dia < 1 || dia > max) System.out.println("Dia invalido.");
            } while (dia < 1 || dia > max);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida.");
        }
    }

    public void setMes() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Mes (1-12): ");
                mes = Integer.parseInt(sc.nextLine().trim());
                if (mes < 1 || mes > 12) System.out.println("Mes invalido.");
            } while (mes < 1 || mes > 12);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida.");
        }
    }

    public void setAno() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Ano: ");
                ano = Integer.parseInt(sc.nextLine().trim());
                if (ano <= 0) System.out.println("Ano invalido.");
            } while (ano <= 0);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida.");
        }
    }

    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }

    public String mostra1() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String mostra2() {
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String nomeMes = (mes >= 1 && mes <= 12) ? meses[mes - 1] : "Invalido";
        return String.format("%02d/%s/%d", dia, nomeMes, ano);
    }

    public boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int diasTranscorridos() {
        int total = 0;
        for (int m = 1; m < mes; m++) total += diasNoMes(m, ano);
        total += dia;
        return total;
    }

    public void apresentaDataAtual() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(new Date()));
    }

    private int diasNoMes(int m, int a) {
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2: return ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) ? 29 : 28;
            default: return 31;
        }
    }
}
