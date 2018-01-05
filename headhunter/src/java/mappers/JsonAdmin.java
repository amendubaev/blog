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
import model.Admin;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Gerune
 */
public class JsonAdmin {
    
    public static String toJSON(Admin admin)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(admin);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static String toJSON(List<Admin> admins)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(admins);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static Admin fromJSON(String jsonAdmin)
    {
        ObjectMapper mapper = new ObjectMapper();
        Admin admin;
        try {
            admin = (Admin)mapper.readValue(jsonAdmin,Admin.class);
            return admin;
        } catch (IOException ex) {
            Logger.getLogger(JsonAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;

    }
    
}

