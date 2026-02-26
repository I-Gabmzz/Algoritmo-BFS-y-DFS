package Modelo;

// Clase que representa cada vertice del grafo
public class Nodo {

    // Nombre o identificador del nodo
    private String nombre;

    // Variable que indica si el nodo ya fue visitado
    private boolean visitado;

    // Constructor que inicializa el nombre del nodo
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.visitado = false; // Por defecto no ha sido visitado
    }

    // Metodo que devuelve el nombre del nodo
    public String getNombre() {
        return nombre;
    }

    // Metodo que indica si el nodo fue visitado
    public boolean isVisitado() {
        return visitado;
    }

    // Metodo que cambia el estado de visitado
    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    // Metodo que permite imprimir el nodo como texto
    @Override
    public String toString() {
        return nombre;
    }
}