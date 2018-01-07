package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Vacancy;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonVacancy {
    
    public static String toJSON(Vacancy vacancy)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(vacancy);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonVacancy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static String toJSON(List<Vacancy> vacancys)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(vacancys);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonVacancy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static Vacancy fromJSON(String jsonVacancy)
    {
        ObjectMapper mapper = new ObjectMapper();
        Vacancy vacancy;
        try {
            vacancy = (Vacancy)mapper.readValue(jsonVacancy,Vacancy.class);
            return vacancy;
        } catch (IOException ex) {
            Logger.getLogger(JsonVacancy.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;

    }
    
}

