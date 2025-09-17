package application;

import application.lista.ListaSimples;

public class Main {
    public static void main(String[] args) {
        //Declaração de Vetores
        int [] numeros = new int [5];

        //Declaração de Matrizes
        int [][] matriz = new int [5][3];

        //Declaração de listaSimples
        ListaSimples lista = new ListaSimples();
        lista.adicionar("Primeiro");
        lista.adicionar("Segundo");
        lista.adicionar("terceiro");
        lista.remover(0);

        System.out.println(lista);
    }
}

