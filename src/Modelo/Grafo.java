package Modelo;

import java.util.*;

// Clase encargada de administrar los nodos y sus conexiones
public class Grafo {

    // Mapa donde guardo los nodos por su nombre
    private Map<String, Nodo> nodos;

    // Lista de adyacencia donde guardo los vecinos de cada nodo
    private Map<Nodo, List<Nodo>> listaAdyacencia;

    // Constructor que inicializa las estructuras
    public Grafo() {
        nodos = new HashMap<>();
        listaAdyacencia = new HashMap<>();
    }

    // Metodo para agregar un nodo al grafo
    public void agregarNodo(String nombre) {

        // Si el nodo no existe lo agrego
        if (!nodos.containsKey(nombre)) {
            Nodo nuevo = new Nodo(nombre);
            nodos.put(nombre, nuevo);
            listaAdyacencia.put(nuevo, new ArrayList<>());
        }
    }

    // Metodo para agregar una arista entre dos nodos
    public void agregarArista(String origen, String destino) {

        Nodo nodoOrigen = nodos.get(origen);
        Nodo nodoDestino = nodos.get(destino);

        // Se agrega el nodo destino a la lista de vecinos del origen
        listaAdyacencia.get(nodoOrigen).add(nodoDestino);
    }

    // Metodo para obtener un nodo por su nombre
    public Nodo obtenerNodo(String nombre) {
        return nodos.get(nombre);
    }

    // Metodo que devuelve los vecinos de un nodo
    public List<Nodo> obtenerVecinos(Nodo nodo) {
        return listaAdyacencia.get(nodo);
    }

    // Metodo que reinicia todos los nodos como no visitados
    public void reiniciarVisitados() {

        for (Nodo nodo : nodos.values()) {
            nodo.setVisitado(false);
        }
    }
}