/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAL.BusyModeDAL;
import DAL.CompanyDAL;
import java.util.List;
import model.BusyMode;
import model.Company;
import model.Vacancy;

/**
 *
 * @author Gerune
 */
public class CompanyController {
    protected CompanyDAL companyDal ;
    public CompanyController() {
        companyDal =  new CompanyDAL();
    }
    
    public List<Vacancy> selectVacancyForCompany()
    {
        return companyDal.selectVacancyForCompany();
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
