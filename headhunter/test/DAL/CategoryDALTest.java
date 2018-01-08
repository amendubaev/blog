package DAL;

import java.util.List;
import model.Category;
import model.Vacancy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class CategoryDALTest {
    
    public CategoryDALTest() {
    }

    @Test
    public void testSelectAll() {
        System.out.println("CategoryDal selectAll");
        CategoryDAL instance = new CategoryDAL();
        List<Category> result = instance.selectAll();
        assertTrue(result != null && result.size() > 0);
    }

    @Test
    public void testSelectById() {
        System.out.println("CategoryDal selectById");
        int id = 1;
        CategoryDAL instance = new CategoryDAL();
        Category result = instance.selectById(id);
        assertTrue(result != null);
    }
    
    @Test
    public void testSelectVacancyForCategory() {
        System.out.println("CategoryDal selectVacancyForBM");
        CategoryDAL instance = new CategoryDAL();
        List<Vacancy> result = instance.selectVacancyForCategory(100);
        assertTrue(result != null);
    }
    
    @Test
    public void testInsert() {
        System.out.println("insert");
        Category category = new Category(100, "Model");
        CategoryDAL instance = new CategoryDAL();
        int expResult = 1;
        int result = instance.insert(category);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Category category = new Category(100, "Model");
        CategoryDAL instance = new CategoryDAL();
        int expResult = 1;
        int result = instance.update(category);
        assertEquals(expResult, result);
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Category category = new Category(100, null);
        CategoryDAL instance = new CategoryDAL();
        int expResult = 1;
        int result = instance.delete(category);
        assertEquals(expResult, result);
    }

}
