
package ues.edu.sv.tpi135_ingenieria.mantenimiento.servicioREST;

import java.net.URI;
import java.util.List;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONException;
/**
 *
 * @author esperanza
 */
//@Path("/mantenimiento")
public class MantenimientoServicioREST {
   Client cliente;
   WebTarget webtarget;
    private final static String URL_RESOURCE = "http://localhost:8080/mantenimiento";
    public MantenimientoServicioREST(){
        this.cliente = ClientBuilder.newClient();
        this.webtarget = cliente.target(URL_RESOURCE);
    }
    
    public URI postMantenimiento(List<List<String>> lista) throws JSONException{
        for (List<String> list : lista) {
            for (String string : list) {
                if (lista != null && !string.trim().isEmpty()) {
                    JsonObject nuevo = Json.createObjectBuilder()
                            .add("mantenimiento", string.trim().toUpperCase()).build();         
                    
                    Response respuesta = webtarget.path("mantenimientoRaw").
                            request(MediaType.APPLICATION_JSON)
                            .accept(MediaType.APPLICATION_JSON)
                            .post(Entity.json(nuevo));
                    if (respuesta!= null 
                            && respuesta.getStatus() 
                            == Response.Status.CREATED.getStatusCode()) {
                        return respuesta.getLocation();
                    }
                }  
            }
        }      
      return null;
    }
    
    public URI postMarca(List<List<String>> listaMarca){
        for(List<String> list : listaMarca){
            for(String string : list){
                if (listaMarca != null && string.trim().isEmpty()) {
                    JsonObject nuevaMarca = Json.createObjectBuilder()
                            .add("marca", string.trim().toUpperCase()).build();
                    
                    Response respuesta = webtarget.path("marcaRaw").
                            request(MediaType.APPLICATION_JSON)
                            .accept(MediaType.APPLICATION_JSON).
                            post(Entity.json(nuevaMarca));
                    if(respuesta != null 
                            && respuesta.getStatus() 
                            == Response.Status.CREATED.getStatusCode()) {
                        return respuesta.getLocation();
                    }
                }
            }
        }
       return null;   
    }
    
    public URI postEquipo(List<List<String>> listaEquipo){
        for(List<String> list : listaEquipo){
            for(String string : list){
                if (listaEquipo != null && string.trim().isEmpty()) {
                    JsonObject nuevoEquipo = Json.createObjectBuilder()
                            .add("equipo", string.trim().toUpperCase()).build();
                    
                    Response respuesta = webtarget.path("equipoRaw")
                            .request(MediaType.APPLICATION_JSON)
                            .accept(MediaType.APPLICATION_JSON).post(Entity.json(nuevoEquipo));
                    if (respuesta != null 
                            && respuesta.getStatus() 
                            == Response.Status.CREATED.getStatusCode()) {
                        return respuesta.getLocation();
                    }
                }
            }
        }
        return null;
    }
    
    public URI postModelo(List<List<String>> listaModelo){
        for(List<String> list : listaModelo){
            for(String string : list){
                if (listaModelo != null && !string.trim().isEmpty()) {
                    JsonObject nuevoModelo = Json.createObjectBuilder()
                            .add("modelo", string.trim().toUpperCase()).build();
                    
                    Response respuesta = webtarget.path("modeloRaw").
                            request(MediaType.APPLICATION_JSON)
                            .accept(MediaType.APPLICATION_JSON).
                            post(Entity.json(nuevoModelo));
                    if (respuesta != null 
                            && respuesta.getStatus() 
                            == Response.Status.CREATED.getStatusCode()) {
                        return respuesta.getLocation();
                    }
                }
            }
            
        }
        return null;
    }
    
    public URI postResponsable(List<List<String>> listaResponsable){
        for (List<String> list : listaResponsable) {
            for(String string : list){
                if (listaResponsable != null && string.trim().isEmpty()) {
                    JsonObject nuevoResponsable = Json.createObjectBuilder().add("responsable", string.trim().toUpperCase()).build();
                    Response respuesta = webtarget.path("responsableRaw").
                            request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).
                            post(Entity.json(nuevoResponsable));
                    if (respuesta != null && respuesta.getStatus() == Response.Status.CREATED.getStatusCode()) {
                        return respuesta.getLocation();
                    }
                }
            }
        }
        return null;
    }
    
    public URI postSistemaOperativo(List<List<String>> listaOS){
        for (List<String> list : listaOS) {
            for(String string : list){
                if (listaOS != null && string.trim().isEmpty()) {
                    JsonObject nuevoOS = Json.createObjectBuilder()
                            .add("OS", string.trim().toUpperCase()).build();
                    
                    Response respuesta = webtarget.path("OSraw").
                            request(MediaType.APPLICATION_JSON).
                            post(Entity.json(Entity.json(nuevoOS)));
                    if (respuesta != null 
                            && respuesta.getStatus() 
                            == Response.Status.CREATED.getStatusCode()) {
                        return respuesta.getLocation();
                    }
                }
            }
        }
        return null;
    }
    
}
