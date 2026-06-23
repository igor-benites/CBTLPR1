import java.util.Scanner;

/*
 * Exercicio 02 - Classe ConsultaAgendada
 * Nome: Igor Flores
 */

public class ConsultaAgendada {

    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    public ConsultaAgendada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Data da consulta ---");
        data = new Data();
        System.out.println("--- Hora da consulta ---");
        hora = new Hora();
        System.out.print("Nome do paciente: ");
        nomePaciente = sc.nextLine();
        System.out.print("Nome do medico: ");
        nomeMedico = sc.nextLine();
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        hora = new Hora(h, mi, s);
        data = new Data(d, m, a);
        nomePaciente = p;
        nomeMedico = med;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String med) {
        data = d;
        hora = h;
        nomePaciente = p;
        nomeMedico = med;
        quantidade++;
    }

    public void setData(int a, int b, int c) {
        data = new Data(a, b, c);
    }

    public void setHora(int a, int b, int c) {
        hora = new Hora(a, b, c);
    }

    public void setNomePaciente(String p) { nomePaciente = p; }
    public void setNomeMedico(String m) { nomeMedico = m; }

    public void setData() {
        System.out.println("--- Nova data ---");
        data = new Data();
    }

    public void setHora() {
        System.out.println("--- Nova hora ---");
        hora = new Hora();
    }

    public void setNomePaciente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do paciente: ");
        nomePaciente = sc.nextLine();
    }

    public void setNomeMedico() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do medico: ");
        nomeMedico = sc.nextLine();
    }

    public int getAmostra() { return quantidade; }

    // dd/mm/aa
    public String getData() {
        return String.format("%02d/%02d/%02d", data.getDia(), data.getMes(), data.getAno() % 100);
    }

    // hh:mm:ss
    public String getHora() {
        return hora.getHora1();
    }

    public String getNomePaciente() { return nomePaciente; }
    public String getNomeMedico() { return nomeMedico; }
}
