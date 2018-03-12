
package ues.edu.sv.tpi135_ingenieria.mantenimiento.servicioREST;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import ues.edu.sv.tpi135_ingenieria.mantenimiento.Lector;
import ues.edu.sv.tpi135_ingenieria.mantenimiento.Mantenimiento;
/**
 *
 * @author esperanza
 */
@Path("mantenimiento")
public class MantenimientoServicioREST {
   
    private Lector dataService = Lector.getInstance();
    private String path; 
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getMantenimientos(){ 
        //Devuelve todos los mantenimientos del path
        return dataService.obtenerArchivos(path);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String setMantenimiento(Mantenimiento mtn){
        //Cambie los metodos que habia hecho, falta un metodo en la clase Lector que haga parse 
        //Si no me falla la memoria, aqui va lo de la lista de lista de string
        return null;
    }
    
    @GET
    @Path("{id_mantenimiento}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getIdMantenimiento(@PathParam("id_mantenimiento") String id_mantenimiento) {
        return dataService.obtenerArchivos("{id}");
    }
    
}
