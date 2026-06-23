package com.llanquihue.ui;

import com.llanquihue.data.GestorColaboradores;
import java.io.IOException;

/**
 * Clase principal,ejecucion y demostracion del sistema
 */
public class Main {
    public static void main(String[] args) {
        GestorColaboradores gestor = new GestorColaboradores();

        try {
            System.out.println("--- Iniciando Llanquihue Tour App ---");

            //Carga desde  Excel
            gestor.cargarDesdeExcel("colaboradores.xlsx");

            // visualizar y recorrer
            System.out.println("\n--- 1. Listado Completo de Colaboradores ---");
            gestor.mostrarTodos();

            //  busqueda
            System.out.println("\n--- 2. Búsqueda por Nombre (Sandra) ---");
            gestor.buscarPorNombre("Sandra");

            //  filtrado
            System.out.println("\n--- 3. Filtrado por Rol (Guia) ---");
            gestor.filtrarPorRol("Guia");

        } catch (IOException e) {
            // Manejo de excepciones
            System.err.println("Error crítico del sistema: " + e.getMessage());
        }

        System.out.println("\n--- Fin de la Demostración ---");
    }
}