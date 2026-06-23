import java.io.*;

/*
 * Exercicio 04 - Escreve o resultado do exercicio 3 em arquivo texto
 * Nome: Igor Flores
 */

public class SubstP2Ex04 {
    public static void main(String[] args) throws Exception {

        PrintStream fileOut = new PrintStream("resultado.txt");
        PrintStream console = System.out;
        System.setOut(fileOut);

        ConsultaAgendada p1 = new ConsultaAgendada(14, 30, 0, 15, 6, 2026, "Ana Silva", "Dr. Carlos");
        System.out.println("\n--- Consulta p1 ---");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Medico: " + p1.getNomeMedico());
        System.out.println("Quantidade de consultas: " + p1.getAmostra());

        Data d2 = new Data(20, 6, 2026);
        Hora h2 = new Hora(9, 0, 0);
        ConsultaAgendada p2 = new ConsultaAgendada(d2, h2, "Bruno Lima", "Dra. Fernanda");
        System.out.println("\n--- Consulta p2 ---");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Paciente: " + p2.getNomePaciente());
        System.out.println("Medico: " + p2.getNomeMedico());
        System.out.println("Quantidade de consultas: " + p2.getAmostra());

        p1.setData(10, 3, 2027);
        p1.setHora(8, 45, 0);
        p1.setNomePaciente("Ana Souza");
        p1.setNomeMedico("Dr. Roberto");

        System.out.println("\n--- p1 atualizado ---");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Medico: " + p1.getNomeMedico());

        System.out.println("\nTotal de consultas: " + p1.getAmostra());

        fileOut.close();
        System.setOut(console);
        System.out.println("Resultado salvo em resultado.txt");
    }
}
