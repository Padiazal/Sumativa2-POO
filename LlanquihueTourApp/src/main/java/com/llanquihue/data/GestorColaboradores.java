package com.llanquihue.data;

import com.llanquihue.model.Colaborador;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class GestorColaboradores {
    // Uso de volecciones dinamicas
    private final List<Colaborador> colaboradores;

    public GestorColaboradores() {
        this.colaboradores = new ArrayList<>();
    }

    /**
     * Carga datos desde Excel
     */
    public void cargarDesdeExcel(String nombreArchivo) throws IOException {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(nombreArchivo)) {
            if (is == null) throw new IOException("Archivo no encontrado: " + nombreArchivo);

            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter(); // Evita errores con celdas con numeros

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Saltar encabezado

                String rut = formatter.formatCellValue(row.getCell(0));
                String nombre = formatter.formatCellValue(row.getCell(1));
                String rol = formatter.formatCellValue(row.getCell(2));
                String contacto = formatter.formatCellValue(row.getCell(3));

                if (!rut.isEmpty()) {
                    colaboradores.add(new Colaborador(rut, nombre, rol, contacto));
                }
            }
        }
    }

    /**
     * visualizacion y recorrido completo
     */
    public void mostrarTodos() {
        for (Colaborador c : colaboradores) { //  for-each para recorrido
            System.out.println(c);
        }
    }

    /**
     *  Búsqueda  por nombre
     */
    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (Colaborador c : colaboradores) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Resultado: " + c);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontró al colaborador: " + nombre);
    }

    /**
     * Filtrado por rol
     */
    public void filtrarPorRol(String rol) {
        System.out.println("--- Colaboradores con Rol: " + rol + " ---");
        for (Colaborador c : colaboradores) {
            if (c.getRol().equalsIgnoreCase(rol)) {
                System.out.println(c);
            }
        }
    }
}