
package com.mycompany;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectorArchivo {

    
    public static String leerArchivo(String ruta) throws IOException {
        StringBuilder contenido = new StringBuilder();

        try (FileInputStream archivo = new FileInputStream(ruta);
             InputStreamReader conversor = new InputStreamReader(archivo);
             BufferedReader filtro = new BufferedReader(conversor)) {

            String linea = filtro.readLine();
            while (linea != null) {
                contenido.append(linea).append(System.lineSeparator());
                linea = filtro.readLine();
            }
        }

        return contenido.toString();
    }
}
