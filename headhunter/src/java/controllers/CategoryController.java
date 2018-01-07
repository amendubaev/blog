package controllers;

import DAL.CategoryDAL;
import java.util.List;
import model.Category;
import model.Vacancy;

public class CategoryController {
    
    protected CategoryDAL categoryDal ;
    public CategoryController() {
        categoryDal =  new CategoryDAL();
    }
    
    public List<Category> getAllCategory()
    {
        return categoryDal.selectAll();
    }

    public List<Vacancy> selectVacancyForCategory(int id)
    {
        return categoryDal.selectVacancyForCategory(id);
    }
    
    public Category getCategoryById(int id)
    {
        return categoryDal.selectById(id);
    }
    
    public int insertCategory(Category category)
    {
        return categoryDal.insert(category);
    }
    public int updateCategory(Category category)
    {
        return categoryDal.update(category);
    }
    
     public int deleteCategory(Category category)
    {
        return categoryDal.delete(category);
    }
}