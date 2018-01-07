package controllers;

import DAL.BusyModeDAL;
import DAL.VacancyDAL;
import DAL.CompanyDAL;
import java.util.List;
import model.BusyMode;
import model.Category;
import model.Company;
import model.Vacancy;

public class VacancyController {
    
    protected VacancyDAL vacancyDal ;
    
    public VacancyController() {
        vacancyDal =  new VacancyDAL();
    }
    
    public List<Company> selectVacancyForCompany(int id)
    {
        return vacancyDal.selectVacancyForCompany(id);
    }
   
    public List<Category> selectVacancyForCategory(int id)
    {
        return vacancyDal.selectVacancyForCategory(id);
    }
    
    public List<BusyMode> selectVacancyForBM(int id)
    {
        return vacancyDal.selectVacancyForBM(id);
    }
    
    public List<Vacancy> getAllVacancy()
    {
        return vacancyDal.selectAll();
    }
    
    public Vacancy getVacancyById(int id)
    {
        return vacancyDal.selectById(id);
    }
    
    public int insertVacancy(Vacancy vacancy)
    {
        return vacancyDal.insert(vacancy);
    }
    public int updateVacancy(Vacancy vacancy)
    {
        return vacancyDal.update(vacancy);
    }
    
     public int deleteVacancy(Vacancy vacancy)
    {
        return vacancyDal.delete(vacancy);
    }
}
