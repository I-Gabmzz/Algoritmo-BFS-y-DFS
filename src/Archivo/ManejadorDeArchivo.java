package Archivo;

import Modelo.Grafo;
import java.io.*;

// Clase encargada de leer el archivo de texto y construir el grafo
public class ManejadorDeArchivo {

    // Metodo que carga el grafo desde un archivo
    public static Grafo cargarGrafo(String nombreArchivo) {

        // Se crea el objeto grafo que se va a llenar
        Grafo grafo = new Grafo();

        BufferedReader lector = null;

        try {
            // Se inicializa el lector del archivo
            lector = new BufferedReader(new FileReader(nombreArchivo));

            String linea;

            // Se lee el archivo linea por linea
            while ((linea = lector.readLine()) != null) {

                // Se separa el nodo principal de sus vecinos
                String[] partes = linea.split(":");
                String nodo = partes[0];

                // Se agrega el nodo al grafo
                grafo.agregarNodo(nodo);

                // Si tiene vecinos se agregan
                if (partes.length > 1 && !partes[1].isEmpty()) {

                    String[] vecinos = partes[1].split(",");

                    for (String vecino : vecinos) {

                        // Se asegura que el vecino exista
                        grafo.agregarNodo(vecino);

                        // Se agrega la conexion
                        grafo.agregarArista(nodo, vecino);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo del grafo");
            e.printStackTrace();
        } finally {
            // Se cierra el archivo para liberar memoria
            try {
                if (lector != null) lector.close();
            } catch (Exception e) {}
        }

        // Se devuelve el grafo ya construido
        return grafo;
    }
}