package controllers;

import DAL.BusyModeDAL;
import DAL.CompanyDAL;
import java.util.List;
import model.BusyMode;
import model.Company;
import model.Vacancy;

public class CompanyController {
    protected CompanyDAL companyDal ;
    public CompanyController() {
        companyDal =  new CompanyDAL();
    }
    
    public List<Vacancy> selectVacancyForCompany(int id)
    {
        return companyDal.selectVacancyForCompany(id);
    }

    public List<Company> selectAll()
    {
        return companyDal.selectAll();
    }
    
    public Company selectById(int id)
    {
        return companyDal.selectById(id);
    }
    
    public int insert(Company company)
    {
        return companyDal.insert(company);
    }
    public int update(Company company)
    {
        return companyDal.update(company);
    }
    
     public int delete(Company company)
    {
        return companyDal.delete(company);
    }
}
