package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonCategory {
    
    public static String toJSON(Category category)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(category);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static String toJSON(List<Category> categorys)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(categorys);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static Category fromJSON(String jsonCategory)
    {
        ObjectMapper mapper = new ObjectMapper();
        Category category;
        try {
            category = (Category)mapper.readValue(jsonCategory,Category.class);
            return category;
        } catch (IOException ex) {
            Logger.getLogger(JsonCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;

    }
    
}

