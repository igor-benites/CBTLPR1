import java.util.Scanner;

/*
 * Enunciado: Criar a classe Hora com atributos hora, min e seg. Implementar construtores,
 * getters, setters com e sem parâmetros, getHora1(), getHora2() e getSegundos().
 * Nome: Igor Flores
 */

public class TP03Ex01 {

    private int hora;
    private int min;
    private int seg;

    // Construtor sem argumentos: lê valores do teclado com validação
    public TP03Ex01() {
        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.print("Digite a hora (0-23): ");
                hora = Integer.parseInt(sc.nextLine().trim());
                if (hora < 0 || hora > 23)
                    System.out.println("Hora invalida, tente novamente.");
            } while (hora < 0 || hora > 23);

            do {
                System.out.print("Digite os minutos (0-59): ");
                min = Integer.parseInt(sc.nextLine().trim());
                if (min < 0 || min > 59)
                    System.out.println("Minutos invalidos, tente novamente.");
            } while (min < 0 || min > 59);

            do {
                System.out.print("Digite os segundos (0-59): ");
                seg = Integer.parseInt(sc.nextLine().trim());
                if (seg < 0 || seg > 59)
                    System.out.println("Segundos invalidos, tente novamente.");
            } while (seg < 0 || seg > 59);

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Valores zerados por padrao.");
            hora = 0;
            min = 0;
            seg = 0;
        }
    }

    // Construtor com argumentos
    public TP03Ex01(int h, int m, int s) {
        hora = h;
        min = m;
        seg = s;
    }

    // Setters com parâmetro
    public void setHor(int h) {
        hora = h;
    }

    public void setMin(int m) {
        min = m;
    }

    public void setSeg(int s) {
        seg = s;
    }

    // Setters sem parâmetro: lê do teclado com validação
    public void setHor() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Digite a hora (0-23): ");
                hora = Integer.parseInt(sc.nextLine().trim());
                if (hora < 0 || hora > 23)
                    System.out.println("Hora invalida, tente novamente.");
            } while (hora < 0 || hora > 23);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Hora nao alterada.");
        }
    }

    public void setMin() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Digite os minutos (0-59): ");
                min = Integer.parseInt(sc.nextLine().trim());
                if (min < 0 || min > 59)
                    System.out.println("Minutos invalidos, tente novamente.");
            } while (min < 0 || min > 59);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Minuto nao alterado.");
        }
    }

    public void setSeg() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Digite os segundos (0-59): ");
                seg = Integer.parseInt(sc.nextLine().trim());
                if (seg < 0 || seg > 59)
                    System.out.println("Segundos invalidos, tente novamente.");
            } while (seg < 0 || seg > 59);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Segundo nao alterado.");
        }
    }

    // Getters
    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    // Retorna hora no formato hh:mm:ss
    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }

    // Retorna hora no formato hh:mm:ss AM/PM
    public String getHora2() {
        String periodo;
        int h12;

        if (hora < 12) {
            periodo = "AM";
            h12 = (hora == 0) ? 12 : hora;
        } else {
            periodo = "PM";
            h12 = (hora == 12) ? 12 : hora - 12;
        }

        return String.format("%02d:%02d:%02d %s", h12, min, seg, periodo);
    }

    // Retorna total de segundos
    public int getSegundos() {
        return hora * 3600 + min * 60 + seg;
    }
}
