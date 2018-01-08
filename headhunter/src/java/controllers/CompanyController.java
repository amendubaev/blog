package controllers;

import DAL.CompanyDAL;
import java.util.List;
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

    public List<Company> getAllCompany()
    {
        return companyDal.selectAll();
    }
    
    public Company getCompanyById(int id)
    {
        return companyDal.selectById(id);
    }
    
    public int insertCompany(Company company)
    {
        return companyDal.insert(company);
    }
    public int updateCompany(Company company)
    {
        return companyDal.update(company);
    }
    
     public int deleteCompany(Company company)
    {
        return companyDal.delete(company);
    }
}
