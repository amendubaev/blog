/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import DAL.CategoryDAL;
import java.util.List;
import model.Category;
import model.Vacancy;
/**
 *
 * @author greypk
 */
public class CategoryController {
    
    protected CategoryDAL categoryDal ;
    public CategoryController() {
        categoryDal =  new CategoryDAL();
    }
    
    public List<Category> selectAll()
    {
        return categoryDal.selectAll();
    }

    public List<Vacancy> selectVacancyForCategory()
    {
        return categoryDal.selectVacancyForCategory();
    }
    
    public Category selectById(int id)
    {
        return categoryDal.selectById(id);
    }
    
    public int insert(Category category)
    {
        return categoryDal.insert(category);
    }
    public int update(Category category)
    {
        return categoryDal.update(category);
    }
    
     public int delete(Category category)
    {
        return categoryDal.delete(category);
    }
}