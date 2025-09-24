package application;

import application.lista.ListaSimples;
import application.pilha.PilhaSimples;

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
        
        PilhaSimples pilha = new PilhaSimples (3);      
        pilha.empilhar("Primeiro Elemento"); 
        pilha.empilhar("Segundo Elemento");

        System.out.println(pilha.desempilhar());
        pilha.empilhar("Terceiro Elemento");
         System.out.println(pilha.desempilhar());
         System.out.println(pilha.desempilhar());
         System.out.println(pilha.desempilhar());
        
        System.out.println(pilha);
        
    }
}

