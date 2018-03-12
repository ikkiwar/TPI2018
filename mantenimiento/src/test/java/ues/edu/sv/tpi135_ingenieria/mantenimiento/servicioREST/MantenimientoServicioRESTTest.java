package ues.edu.sv.tpi135_ingenieria.mantenimiento.servicioREST;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author esperanza
 */
public class MantenimientoServicioRESTTest{
    
    
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
    
    @Test
    public void setMantenimientosTest(){
        System.out.println("Prueba post mantenimientos");
        List<String> mtn = new ArrayList<>();
        mtn.add("id_mantenimiento");
        mtn.add("Toshiba");
        
        MantenimientoServicioREST instance = new MantenimientoServicioREST();
        URI expResult = null;
        URI result = instance.postMantenimiento(mtn);
        assertEquals(expResult, result);
    }
}
