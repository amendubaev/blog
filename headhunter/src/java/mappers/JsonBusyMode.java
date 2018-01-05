/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BusyMode;
import org.codehaus.jackson.map.ObjectMapper; 

/**
 *
 * @author greypk
 */
public class JsonBusyMode {
    
    public static String toJSON(BusyMode busymode)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(busymode);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonBusyMode.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static String toJSON(List<BusyMode> busymodes)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(busymodes);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonBusyMode.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static BusyMode fromJSON(String jsonBusyMode)
    {
        ObjectMapper mapper = new ObjectMapper();
        BusyMode busymode;
        try {
            busymode = (BusyMode)mapper.readValue(jsonBusyMode,BusyMode.class);
            return busymode;
        } catch (IOException ex) {
            Logger.getLogger(JsonBusyMode.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;

    }
    
}


