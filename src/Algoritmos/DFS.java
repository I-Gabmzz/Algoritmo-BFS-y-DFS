package Algoritmos;

import Modelo.*;
import Estructuras.*;
import java.util.*;

// Clase que implementa el algoritmo DFS (Busqueda en profundidad)
public class DFS {

    // Metodo que realiza la busqueda en el grafo
    public static void buscar(Grafo grafo, String inicio, String objetivo) {

        // Se declara la estructura LIFO (pila)
        Pila pila = new Pila();

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

        // Scanner para avanzar manualmente por pasos
        Scanner scanner = new Scanner(System.in);

        // Mientras la pila NO este vacia
        while (!pila.estaVacia()) {

            System.out.println("| Paso " + paso + " |-----------------------------");

            // Se muestra el contenido actual de la pila
            System.out.println("Pila actual: " + pila);

            // Se saca el ultimo nodo agregado (LIFO)
            Nodo actual = pila.desapilar();

            // Se muestra el nodo actual en esta iteracion
            System.out.println("Nodo actual: " + actual);

            // Si el nodo es el objetivo se termina el algoritmo
            if (actual.equals(nodoObjetivo)) {
                System.out.println("Nodo encontrado: " + actual + "\n");
                return;
            }

            // Si NO es el objetivo, se agregan sus hijos en orden inverso (pre-orden)
            List<Nodo> vecinos = grafo.obtenerVecinos(actual);

            for (int i = vecinos.size() - 1; i >= 0; i--) {
                pila.apilar(vecinos.get(i));
            }

            // Pausa para avanzar paso por paso
            System.out.println("\nPresiona ENTER para continuar...");
            scanner.nextLine();

            System.out.println();
            paso++;
        }

        // Si la pila se vacia y no se encontro el nodo
        System.out.println("Nodo no encontrado\n");
    }
}