package Algoritmos;

import Modelo.*;
import Estructuras.*;
import java.util.*;

// Clase que implementa el algoritmo DFS (Busqueda en profundidad)
public class DFS {

    // Metodo que realiza la busqueda en el grafo
    public static void buscar(Grafo grafo, String inicio, String objetivo) {

        // Se reinician todos los nodos como no visitados
        grafo.reiniciarVisitados();

        // Se declara la estructura LIFO (pila)
        Pila pila = new Pila();

        // Lista auxiliar para visualizar los nodos visitados
        List<Nodo> visitados = new ArrayList<>();

        // Se obtienen el nodo inicial y el nodo objetivo
        Nodo nodoInicio = grafo.obtenerNodo(inicio);
        Nodo nodoObjetivo = grafo.obtenerNodo(objetivo);

        // Se agrega el nodo raiz a la pila
        pila.apilar(nodoInicio);

        // Contador de pasos
        int paso = 1;

        System.out.println("+--------------------------------------+");
        System.out.println("|            EJECUCION DFS             |");
        System.out.println("+--------------------------------------+\n");

        // Mientras la pila NO este vacia
        while (!pila.estaVacia()) {

            System.out.println("| Paso " + paso + " |-----------------------------");

            // Se muestran las estructuras
            System.out.println("Pila actual: " + pila);
            System.out.println("Visitados: " + visitados);

            // Se saca el ultimo nodo (LIFO)
            Nodo actual = pila.desapilar();

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

                // Se agregan los hijos en orden inverso
                List<Nodo> vecinos = grafo.obtenerVecinos(actual);

                for (int i = vecinos.size() - 1; i >= 0; i--) {
                    Nodo vecino = vecinos.get(i);
                    if (!vecino.isVisitado()) {
                        pila.apilar(vecino);
                    }
                }
            }

            System.out.println();
            paso++;
        }

        System.out.println("Nodo no encontrado\n");
    }
}