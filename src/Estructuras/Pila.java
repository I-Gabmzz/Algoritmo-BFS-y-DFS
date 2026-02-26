package Estructuras;

import Modelo.Nodo;
import java.util.*;

// Clase que implementa una estructura LIFO
public class Pila {

    // Lista donde se almacenan los nodos
    private LinkedList<Nodo> elementos;

    // Constructor que inicializa la lista
    public Pila() {
        elementos = new LinkedList<>();
    }

    // Metodo para agregar un nodo al final (tope)
    public void apilar(Nodo nodo) {
        elementos.addLast(nodo);
    }

    // Metodo para sacar el ultimo nodo agregado
    public Nodo desapilar() {
        return elementos.pollLast();
    }

    // Metodo que indica si la pila esta vacia
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    // Metodo que permite visualizar la pila
    @Override
    public String toString() {
        return elementos.toString();
    }
}