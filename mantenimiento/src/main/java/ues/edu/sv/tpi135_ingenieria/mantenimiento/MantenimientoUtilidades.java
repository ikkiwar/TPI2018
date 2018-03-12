
package ues.edu.sv.tpi135_ingenieria.mantenimiento;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author esperanza
 */
public class MantenimientoUtilidades {
    
    public static String crearMantenimientoJSON(Mantenimiento mtn) throws IOException{
        //REST basado en: https://www.logicbig.com/tutorials/java-ee-tutorial/jax-rs/post-example.html
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("src/recursos"), mtn);
        String jsonInString = mapper.writeValueAsString(mtn);
        return jsonInString;    
    }
}
