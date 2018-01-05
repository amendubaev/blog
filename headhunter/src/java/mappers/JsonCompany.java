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
import model.Company;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Gerune
 */
public class JsonCompany {
    
    public static String toJSON(Company company)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(company);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static String toJSON(List<Company> companys)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(companys);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static Company fromJSON(String jsonCompany)
    {
        ObjectMapper mapper = new ObjectMapper();
        Company company;
        try {
            company = (Company)mapper.readValue(jsonCompany,Company.class);
            return company;
        } catch (IOException ex) {
            Logger.getLogger(JsonCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;

    }
    
}

