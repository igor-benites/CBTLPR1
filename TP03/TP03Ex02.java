/*
 * Enunciado: Desenvolver um programa para testar a classe Hora e seus metodos.
 * Nome: Igor Flores
 */

public class TP03Ex02 {
    public static void main(String[] args) {

        // testando o construtor com parametros
        TP03Ex01 h1 = new TP03Ex01(14, 30, 45);
        System.out.println("Hora1: " + h1.getHora1());
        System.out.println("Hora2: " + h1.getHora2());
        System.out.println("Segundos: " + h1.getSegundos());

        // testando os setters com parametro
        h1.setHor(8);
        h1.setMin(5);
        h1.setSeg(0);
        System.out.println("\nApos alterar com setters:");
        System.out.println("Hora1: " + h1.getHora1());
        System.out.println("Hora2: " + h1.getHora2());

        // testando caso do enunciado: 01:00:01 deve dar 3601 segundos
        TP03Ex01 h2 = new TP03Ex01(1, 0, 1);
        System.out.println("\nTeste 01:00:01 -> " + h2.getSegundos() + " segundos");

        // testando meia noite e meio dia
        TP03Ex01 h3 = new TP03Ex01(0, 0, 0);
        TP03Ex01 h4 = new TP03Ex01(12, 0, 0);
        System.out.println("\nMeia-noite: " + h3.getHora2());
        System.out.println("Meio-dia:   " + h4.getHora2());

        // testando construtor via teclado com validacao
        System.out.println("\nDigite uma hora pelo teclado:");
        TP03Ex01 h5 = new TP03Ex01();
        System.out.println("Resultado: " + h5.getHora1() + " / " + h5.getHora2());
        System.out.println("Segundos: " + h5.getSegundos());

        // testando setters via teclado
        System.out.println("\nAlterando os valores via teclado:");
        h5.setHor();
        h5.setMin();
        h5.setSeg();
        System.out.println("Resultado final: " + h5.getHora1() + " / " + h5.getHora2());
    }
}
