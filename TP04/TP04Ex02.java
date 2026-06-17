/*
 * Enunciado: Desenvolver um programa para testar a classe Data e seus metodos.
 * Nome: Igor Flores
 */

public class TP04Ex02 {
    public static void main(String[] args) {

        // testando construtor com parametros, data bissexta
        TP04Ex01 d1 = new TP04Ex01(29, 2, 2024);
        System.out.println("mostra1: " + d1.mostra1());
        System.out.println("mostra2: " + d1.mostra2());
        System.out.println("Bissexto? " + d1.bissexto());
        System.out.println("Dias transcorridos: " + d1.diasTranscorridos());

        // testando data normal, ano nao bissexto
        TP04Ex01 d2 = new TP04Ex01(31, 12, 2026);
        System.out.println("\nmostra1: " + d2.mostra1());
        System.out.println("mostra2: " + d2.mostra2());
        System.out.println("Bissexto? " + d2.bissexto());
        System.out.println("Dias transcorridos: " + d2.diasTranscorridos());

        // testando setters com parametro
        d2.entraDia(1);
        d2.entraMes(1);
        d2.entraAno(2027);
        System.out.println("\nApos alterar com setters:");
        System.out.println("mostra1: " + d2.mostra1());
        System.out.println("Dias transcorridos: " + d2.diasTranscorridos());

        // testando getters
        System.out.println("\nretDia: " + d2.retDia());
        System.out.println("retMes: " + d2.retMes());
        System.out.println("retAno: " + d2.retAno());

        // testando data atual do sistema
        System.out.println("\nData atual do sistema:");
        d2.apresentaDataAtual();

        // testando construtor via teclado com validacao
        System.out.println("\nDigite uma data pelo teclado:");
        TP04Ex01 d3 = new TP04Ex01();
        System.out.println("Resultado: " + d3.mostra1() + " / " + d3.mostra2());
        System.out.println("Bissexto? " + d3.bissexto());
        System.out.println("Dias transcorridos: " + d3.diasTranscorridos());

        // testando setters via teclado
        System.out.println("\nAlterando os valores via teclado:");
        d3.entraAno();
        d3.entraMes();
        d3.entraDia();
        System.out.println("Resultado final: " + d3.mostra1());
    }
}
