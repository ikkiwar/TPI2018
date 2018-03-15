package ues.edu.sv.tpi135_ingenieria.mantenimiento.servicioREST;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.codehaus.jettison.json.JSONException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ues.edu.sv.tpi135_ingenieria.mantenimiento.Mantenimiento;

/**
 *
 * @author esperanza
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ClientBuilder.class)
public class MantenimientoServicioRESTTest{
    Client clienteMock;
    Response res;
    
    @Mock
    Mantenimiento mnt = new Mantenimiento(); 
    MantenimientoServicioREST instance = new MantenimientoServicioREST();
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws URISyntaxException {    
            clienteMock = Mockito.mock(Client.class);
            res = Mockito.mock(Response.class);
            Mockito.when(this.res.getStatus()).thenReturn(Status.CREATED.getStatusCode());
            Mockito.when(this.res.getLocation()).thenReturn(new URI("http://localhost:8080/mantenimiento"));
            Builder bd = Mockito.mock(Builder.class);
            Mockito.when(bd.post(Matchers.any())).thenReturn(this.res);   
            
            final WebTarget wt = Mockito.mock(WebTarget.class);
            Mockito.when(wt.path(Matchers.anyString())).thenReturn(wt);
            Mockito.when(wt.request(MediaType.APPLICATION_JSON)).thenReturn(bd);      
            Mockito.when(this.clienteMock.target(Matchers.anyString())).thenReturn(wt);
            PowerMockito.mockStatic(ClientBuilder.class);
            PowerMockito.when(ClientBuilder.newClient()).thenReturn(clienteMock);
    }
    
    @Test
    public void postMantenimientoTest() throws URISyntaxException{
        try {
            System.out.println("Prueba postMantenimiento");
            List<List<String>> lista = new ArrayList<>();
            Mantenimiento mtn1 = new Mantenimiento(1, 1, "historial", "ABC-123", 
                    "DEF-456", "ASUS", "X541N", "Debian", true, "Buster", "Ninguna");
            Mantenimiento mtn2 = new Mantenimiento(2, 1, "historial", "GHI-789",
                    "JKL-001", "Toshiba", "C45", "Linux Mint", true, "Sylvia", "Ninguna");
            lista.add(new ArrayList<>());
            lista.get(0).add(mtn1.toString());
            lista.add(new ArrayList<>());
            lista.get(1).add(mtn2.toString());
            //Se crea un objeto para el rest
            instance.cliente = this.clienteMock;          
            URI expResult = new URI("http://localhost:8080/mantenimiento");
            URI result = instance.postMantenimiento(lista);
            assertEquals(expResult, result);
        } catch (JSONException ex) {
            Logger.getLogger(MantenimientoServicioRESTTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
}
