import Archivo.ManejadorDeArchivo;
import Modelo.Grafo;
import Algoritmos.BFS;
import Algoritmos.DFS;

// Clase principal donde se ejecuta la aplicacion
public class Main {

    public static void main(String[] args) {

        // Se carga el grafo desde el archivo
        Grafo grafo = ManejadorDeArchivo.cargarGrafo("C:\\Users\\PC OSTRICH\\OneDrive\\Escritorio\\AlgoritmosDeBusqueda_IA\\src\\grafo.txt");

        BFS.buscar(grafo, "1", "10");

        DFS.buscar(grafo, "1", "10");
    }
}