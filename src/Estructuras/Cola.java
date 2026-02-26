package Estructuras;

import Modelo.Nodo;
import java.util.*;

// Clase que implementa una estructura FIFO
public class Cola {

    // Lista donde se almacenan los nodos
    private LinkedList<Nodo> elementos;

    // Constructor que inicializa la lista
    public Cola() {
        elementos = new LinkedList<>();
    }

    // Metodo para agregar un elemento al final
    public void encolar(Nodo nodo) {
        elementos.addLast(nodo);
    }

    // Metodo para sacar el primer elemento
    public Nodo desencolar() {
        return elementos.pollFirst();
    }

    // Metodo que indica si la cola esta vacia
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    // Metodo que permite visualizar la cola
    @Override
    public String toString() {
        return elementos.toString();
    }
}