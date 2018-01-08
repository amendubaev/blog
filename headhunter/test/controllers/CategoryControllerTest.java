package controllers;

import java.util.List;
import model.Category;
import model.Vacancy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CategoryControllerTest {

    public CategoryControllerTest() {
    }

    @Test
    public void testGetAllCategory() {
        System.out.println("CategoryController getAllCategory");
        CategoryController instance = new CategoryController();
        List<Category> result = instance.getAllCategory();
        assertTrue(result != null && result.size() >= 1);
    }

    @Test
    public void testGetCategoryById() {
        System.out.println("CategoryController getCategoryById");
        int id = 1;
        CategoryController instance = new CategoryController();
        Category result = instance.getCategoryById(id);
        assertTrue(result != null && result.getId() == 1);
    }

    @Test
    public void testInsertCategory() {
        System.out.println("CategoryController insertCategory");
        Category category = new Category(100, "Category");
        CategoryController instance = new CategoryController();
        int expResult = 1;
        int result = instance.insertCategory(category);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdateCategory() {
        System.out.println("CategoryController updateCategory");
        Category category = new Category(100, "nCategory");
        CategoryController instance = new CategoryController();
        int expResult = 1;
        int result = instance.updateCategory(category);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSelectVacancyForCategory() {
        System.out.println("CategoryController selectVacancyForCategory");
        CategoryController instance = new CategoryController();
        List<Vacancy> result = instance.selectVacancyForCategory(100);
        assertTrue(result != null);
    }

    @Test
    public void testDeleteCategory() {
        System.out.println("CategoryController deleteCategory");
        Category category = new Category(100, null);
        CategoryController instance = new CategoryController();
        int expResult = 1;
        int result = instance.deleteCategory(category);
        assertEquals(expResult, result);
    }

}
