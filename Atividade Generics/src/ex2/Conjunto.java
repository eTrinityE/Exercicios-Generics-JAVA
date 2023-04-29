package ex2;

import java.util.HashSet;

public class Conjunto<T> {

    private HashSet<T> elementos;

    public Conjunto() {
        this.elementos = new HashSet<T>();
    }

    public void adicionar(T elemento) {
        this.elementos.add(elemento);
    }

    public void remover(T elemento) {
        this.elementos.remove(elemento);
    }

    public boolean contem(T elemento) {
        return this.elementos.contains(elemento);
    }

    public static void main(String[] args) {
        Conjunto<Integer> conjunto = new Conjunto<Integer>();

        conjunto.adicionar(1);
        conjunto.adicionar(2);
        conjunto.adicionar(3);


        System.out.println(conjunto.contem(2));
        System.out.println(conjunto.contem(4));


        conjunto.remover(2);
        System.out.println(conjunto.contem(2));
    }
}

