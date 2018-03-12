/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimiento;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author kevin
 */
public class Lector implements Serializable {
    
    private static Lector instancia = new Lector();
    
    public static Lector getInstance(){
        return instancia;
    }

    public boolean verificarPath(final String path) {

        if (path != null && path.trim().isEmpty() == false) { // si el path no es nulo y tampoco esta vacio retorna true
            return Paths.get(path).toFile().exists();
        }

        return false;
    }

    public List<String> obtenerArchivos(final String path) {
        List<String> listaDeArchivos = null;

        try (Stream<Path> paths = Files.walk(Paths.get(path))) { // devuelve una coleccion de las rutas de los archivo .csv
            listaDeArchivos = paths.map(a -> {
                if (Files.isRegularFile(a) && a.toString().endsWith(".csv")) {
                    return a.toString();
                } else {
                    return "";
                }
            }).collect(Collectors.toList());
            
             listaDeArchivos.remove("");
            for(String url : listaDeArchivos){
            System.out.println(url); 
            }
         
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
        return listaDeArchivos;
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
