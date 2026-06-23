import java.util.Scanner;

/*
 * Classe Hora - dependencia para ConsultaAgendada
 * Nome: Igor Flores
 */

public class Hora {

    private int hora;
    private int min;
    private int seg;

    public Hora() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Hora (0-23): ");
                hora = Integer.parseInt(sc.nextLine().trim());
                if (hora < 0 || hora > 23) System.out.println("Hora invalida.");
            } while (hora < 0 || hora > 23);

            do {
                System.out.print("Minuto (0-59): ");
                min = Integer.parseInt(sc.nextLine().trim());
                if (min < 0 || min > 59) System.out.println("Minuto invalido.");
            } while (min < 0 || min > 59);

            do {
                System.out.print("Segundo (0-59): ");
                seg = Integer.parseInt(sc.nextLine().trim());
                if (seg < 0 || seg > 59) System.out.println("Segundo invalido.");
            } while (seg < 0 || seg > 59);

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Usando 00:00:00.");
            hora = 0; min = 0; seg = 0;
        }
    }

    public Hora(int h, int m, int s) {
        hora = h; min = m; seg = s;
    }

    public void setHor(int h) { hora = h; }
    public void setMin(int m) { min = m; }
    public void setSeg(int s) { seg = s; }

    public void setHor() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Hora (0-23): ");
                hora = Integer.parseInt(sc.nextLine().trim());
                if (hora < 0 || hora > 23) System.out.println("Hora invalida.");
            } while (hora < 0 || hora > 23);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida.");
        }
    }

    public void setMin() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Minuto (0-59): ");
                min = Integer.parseInt(sc.nextLine().trim());
                if (min < 0 || min > 59) System.out.println("Minuto invalido.");
            } while (min < 0 || min > 59);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida.");
        }
    }

    public void setSeg() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Segundo (0-59): ");
                seg = Integer.parseInt(sc.nextLine().trim());
                if (seg < 0 || seg > 59) System.out.println("Segundo invalido.");
            } while (seg < 0 || seg > 59);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida.");
        }
    }

    public int getHor() { return hora; }
    public int getMin() { return min; }
    public int getSeg() { return seg; }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }

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

    public int getSegundos() {
        return hora * 3600 + min * 60 + seg;
    }
}
