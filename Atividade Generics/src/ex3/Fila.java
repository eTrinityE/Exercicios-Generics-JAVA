package ex3;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Fila<T> {
    private LinkedList<T> fila;

    public Fila() {
        fila = new LinkedList<T>();
    }

    public void enfileirar(T elemento) {
        fila.addLast(elemento);
    }

    public T desenfileirar() {
        if (fila.isEmpty()) {
            throw new NoSuchElementException("Fila vazia");
        }
        return fila.removeFirst();
    }

    public int tamanho() {
        return fila.size();
    }

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        System.out.println(fila.tamanho());

        int primeiro = fila.desenfileirar();
        System.out.println(primeiro);
        System.out.println(fila.tamanho());

        fila.enfileirar(4);
        System.out.println(fila.tamanho());
    }

}

