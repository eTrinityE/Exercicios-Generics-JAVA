package ex4;

import java.util.ArrayList;
import java.util.List;

public class Mapa<K, V> {
    private List<Entry<K, V>> entradas;

    public Mapa() {
        entradas = new ArrayList<>();
    }

    public void adicionar(K chave, V valor) {
        entradas.add(new Entry<>(chave, valor));
    }

    public void remover(K chave) {
        entradas.removeIf(entry -> entry.chave.equals(chave));
    }

    public V obter(K chave) {
        for (Entry<K, V> entry : entradas) {
            if (entry.chave.equals(chave)) {
                return entry.valor;
            }
        }
        return null;
    }

    private class Entry<K, V> {
        K chave;
        V valor;

        Entry(K chave, V valor) {
            this.chave = chave;
            this.valor = valor;
        }
    }

    public static void main(String[] args) {
        Mapa<String, Integer> mapa = new Mapa<>();

        mapa.adicionar("chave1", 1);
        mapa.adicionar("chave2", 2);
        mapa.adicionar("chave3", 3);

        System.out.println("Valor correspondente à chave1: " + mapa.obter("chave1"));
        System.out.println("Valor correspondente à chave2: " + mapa.obter("chave2"));
        System.out.println("Valor correspondente à chave3: " + mapa.obter("chave3"));

        mapa.remover("chave2");

        System.out.println("Valor correspondente à chave2 após remoção: " + mapa.obter("chave2"));
    }

}

