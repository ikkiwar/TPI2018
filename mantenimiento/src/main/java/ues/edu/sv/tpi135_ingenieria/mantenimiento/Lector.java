/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimiento;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kevin
 */
public class Lector {

    public boolean verificarPath(final String path) {

        if (path != null && path.trim().isEmpty() == false) {
            return Paths.get(path).toFile().exists();
        }

        return false;
    }

  

    public void leerArchivo(String direccion) {

        try {
            String linea = "";
            FileReader lector = new FileReader(direccion); // lector del archivo 
            int contador = lector.read();  // devuelve el caracter leido o -1 si termina la secuencia

            while (contador > -1) { // lee linea por linea

                char letra = (char) contador; // volvemos por un momento contador en char para tomar su valor 
                linea += letra;       // se concatenan cada letra
                contador = lector.read();
            }

            separador(linea);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, "archivo no encontrado", ex);
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String[] separador(String linea) {
        String objetos[] = linea.split(","); // aqui se separa 

        for (String separado : objetos) { // imprime cada objeto en el array

            System.out.println(separado);
        }

        return objetos;
    }

}
