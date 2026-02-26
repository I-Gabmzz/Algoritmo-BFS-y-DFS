package Algoritmos;

import Modelo.*;
import Estructuras.*;
import java.util.*;

// Clase que implementa el algoritmo BFS (Busqueda en anchura)
public class BFS {

    // Metodo que realiza la busqueda en el grafo
    public static void buscar(Grafo grafo, String inicio, String objetivo) {

        // Se reinician todos los nodos como no visitados
        grafo.reiniciarVisitados();

        // Se declara la estructura FIFO (cola)
        Cola cola = new Cola();

        // Lista auxiliar para visualizar los nodos visitados
        List<Nodo> visitados = new ArrayList<>();

        // Se obtienen el nodo inicial y el nodo objetivo
        Nodo nodoInicio = grafo.obtenerNodo(inicio);
        Nodo nodoObjetivo = grafo.obtenerNodo(objetivo);

        // Se agrega el nodo raiz a la cola
        cola.encolar(nodoInicio);

        // Contador de pasos
        int paso = 1;

        System.out.println("+--------------------------------------+");
        System.out.println("|             EJECUCION BFS            |");
        System.out.println("+--------------------------------------+\n");

        // Mientras la cola NO este vacia
        while (!cola.estaVacia()) {

            System.out.println("| Paso " + paso + " |-----------------------------");

            // Se muestran las estructuras
            System.out.println("Cola actual: " + cola);
            System.out.println("Visitados: " + visitados);

            // Se saca el primer nodo (FIFO)
            Nodo actual = cola.desencolar();

            // Se muestra cual es el nodo actual en esta iteracion
            System.out.println("Nodo actual: " + actual);

            // Si es el nodo objetivo se termina
            if (actual.equals(nodoObjetivo)) {
                System.out.println("Nodo encontrado: " + actual + "\n");
                return;
            }

            // Si no ha sido visitado
            if (!actual.isVisitado()) {

                actual.setVisitado(true);
                visitados.add(actual);

                // Se agregan los hijos no visitados
                for (Nodo vecino : grafo.obtenerVecinos(actual)) {
                    if (!vecino.isVisitado()) {
                        cola.encolar(vecino);
                    }
                }
            }

            System.out.println();
            paso++;
        }

        System.out.println("Nodo no encontrado\n");
    }
}