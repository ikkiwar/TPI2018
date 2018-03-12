
package ues.edu.sv.tpi135_ingenieria.mantenimiento.servicioREST;
import java.net.URI;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import ues.edu.sv.tpi135_ingenieria.mantenimiento.Lector;
/**
 *
 * @author esperanza
 */
@Path("/mantenimiento")
public class MantenimientoServicioREST {
   
    private Lector dataService = Lector.getInstance();
    private String path; 
    WebTarget wt;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getMantenimientos(){ 
        return dataService.obtenerArchivos(path);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public URI postMantenimiento(List<String> mantenimiento){
        if(mantenimiento != null && !mantenimiento.isEmpty()){
            JSONArray jsonMantenimiento = new JSONArray();
            for(String mtn : mantenimiento){
                try {             
                    jsonMantenimiento.put(new JSONArray(mtn));
                    Response res = wt.path("mantenimiento").request(MediaType.APPLICATION_JSON).
                    accept(MediaType.APPLICATION_JSON).post(Entity.json(jsonMantenimiento));
                    if(res.getStatus() == Response.Status.CREATED.getStatusCode() && res != null){
                        return res.getLocation();
                    }   
                } catch (JSONException ex) {
                    Logger.getLogger(MantenimientoServicioREST.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }
    
    @GET
    @Path("{id_mantenimiento}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getIdMantenimiento(@PathParam("id_mantenimiento") String id_mantenimiento) {
        return dataService.obtenerArchivos("{id}");
    }
    
}
