package ex5;

import java.util.ArrayList;
import java.util.Collections;

public class ConjuntoOrdenado<T extends Comparable<T>> {
    private ArrayList<T> elementos;

    public ConjuntoOrdenado() {
        elementos = new ArrayList<>();
    }

    public void adicionar(T elemento) {
        elementos.add(elemento);
        Collections.sort(elementos);
    }

    public void remover(T elemento) {
        elementos.remove(elemento);
    }

    public T obter(int indice) {
        return elementos.get(indice);
    }

    public static void main(String[] args) {
        ConjuntoOrdenado<Integer> conjunto = new ConjuntoOrdenado<>();

        conjunto.adicionar(10);
        conjunto.adicionar(5);
        conjunto.adicionar(20);

        System.out.println(conjunto.obter(0));

        conjunto.remover(10);

        System.out.println(conjunto.obter(0));
    }

}

