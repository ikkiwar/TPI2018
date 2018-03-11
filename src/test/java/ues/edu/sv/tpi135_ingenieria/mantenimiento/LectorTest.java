/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.tpi135_ingenieria.mantenimiento;

import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author kevin
 */
public class LectorTest {
    public LectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of leerArchivo method, of class Lector.
     */
    
    @Test
    public void testLeerArchivo() {
        System.out.println("leerArchivo");
        Lector instance = new Lector();
        instance.leerArchivo("src/recursos/texto_prueba.csv");
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of separador method, of class Lector.
     */
    
    @Test
    public void testSeparador() {
        System.out.println("separador");
        String linea = "";
        Lector instance = new Lector();
        String[] expResult = null;
        String[] result = null;
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
       
    /**
     * Test of verificarPath method, of class Lector.
     */
    
    
    @Test
    public void testVerificarPath() {
        System.out.println("verificarPath");
        String path = "src/recursos/texto_prueba.csv";
        Lector instance = new Lector();
        boolean expResult = true;
        boolean result = instance.verificarPath(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerArchivos method, of class Lector.
     */
    
    
    @Test
    public void testObtenerArchivos() {
        System.out.println("obtenerArchivos");
        String path = "src/recursos/";
        Lector instance = new Lector();
        List<String> expResult = new ArrayList<String>();
        expResult.add("src/recursos/texto_prueba.csv");
        expResult.add("src/recursos/texto.csv");
        List<String> result = instance.obtenerArchivos(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
