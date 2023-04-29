package ex1;

import java.util.ArrayList;

public class PilhaLimitada<T> {
    private int tamanhoMaximo;
    private ArrayList<T> pilha;

    public PilhaLimitada(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.pilha = new ArrayList<T>();
    }

    public void empilhar(T elemento) {
        if (this.tamanho() < this.tamanhoMaximo) {
            this.pilha.add(elemento);
        } else {
            System.out.println("Erro: a pilha está cheia.");
        }
    }

    public T desempilhar() {
        if (!this.estaVazia()) {
            T elementoRemovido = this.pilha.remove(this.tamanho() - 1);
            return elementoRemovido;
        } else {
            System.out.println("Erro: a pilha está vazia.");
            return null;
        }
    }

    public boolean estaVazia() {
        return this.pilha.isEmpty();
    }

    public int tamanho() {
        return this.pilha.size();
    }

    public static void main(String[] args) {
        PilhaLimitada<String> pilhaDeStrings = new PilhaLimitada<String>(3);
        pilhaDeStrings.empilhar("elemento1");
        pilhaDeStrings.empilhar("elemento2");
        pilhaDeStrings.empilhar("elemento3");

        System.out.println(pilhaDeStrings.desempilhar());
        System.out.println(pilhaDeStrings.tamanho());
        System.out.println(pilhaDeStrings.estaVazia());

        pilhaDeStrings.empilhar("elemento4");

        System.out.println(pilhaDeStrings.desempilhar());
        System.out.println(pilhaDeStrings.desempilhar());
        System.out.println(pilhaDeStrings.desempilhar());
        System.out.println(pilhaDeStrings.desempilhar());
    }
}

