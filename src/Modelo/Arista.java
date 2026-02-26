package Modelo;

// Clase que representa una conexion entre dos nodos
public class Arista {

    // Nodo de origen
    private Nodo origen;

    // Nodo de destino
    private Nodo destino;

    // Constructor que recibe los dos nodos
    public Arista(Nodo origen, Nodo destino) {
        this.origen = origen;
        this.destino = destino;
    }

    // Metodo que devuelve el nodo origen
    public Nodo getOrigen() {
        return origen;
    }

    // Metodo que devuelve el nodo destino
    public Nodo getDestino() {
        return destino;
    }
}