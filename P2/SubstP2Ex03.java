/*
 * Exercicio 03 - Teste da classe ConsultaAgendada
 * Nome: Igor Flores
 */

public class SubstP2Ex03 {
    public static void main(String[] args) {

        ConsultaAgendada p1 = new ConsultaAgendada(14, 30, 0, 15, 6, 2026, "Ana Silva", "Dr. Carlos");
        System.out.println("\n--- Consulta p1 ---");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Medico: " + p1.getNomeMedico());
        System.out.println("Quantidade de consultas: " + p1.getAmostra());

        System.out.println("\n--- Dados de p2 (via teclado) ---");
        ConsultaAgendada p2 = new ConsultaAgendada();
        System.out.println("\n--- Consulta p2 ---");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Paciente: " + p2.getNomePaciente());
        System.out.println("Medico: " + p2.getNomeMedico());
        System.out.println("Quantidade de consultas: " + p2.getAmostra());

        System.out.println("\n--- Alterando p1 via teclado ---");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        System.out.println("\n--- p1 atualizado ---");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Medico: " + p1.getNomeMedico());

        System.out.println("\nTotal de consultas: " + p1.getAmostra());
    }
}
