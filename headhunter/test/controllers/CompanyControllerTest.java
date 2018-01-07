/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import model.Company;
import model.Vacancy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Gerune
 */
public class CompanyControllerTest {

    public CompanyControllerTest() {
    }

    @Test
    public void testGetAllCompany() {
        System.out.println("CompanyController getAllCompany");
        CompanyController instance = new CompanyController();
        List<Company> result = instance.getAllCompany();
        assertTrue(result != null && result.size() >= 1);
    }

    @Test
    public void testGetCompanyById() {
        System.out.println("CompanyController getCompanyById");
        int id = 1;
        CompanyController instance = new CompanyController();
        Company result = instance.getCompanyById(id);
        assertTrue(result != null && result.getId() == 1);
    }

    @Test
    public void testInsertCompany() {
        System.out.println("CompanyController insertCompany");
        Company company = new Company(100, "Company", "Description", "98008008080", null);
        CompanyController instance = new CompanyController();
        int expResult = 1;
        int result = instance.insertCompany(company);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdateCompany() {
        System.out.println("CompanyController updateCompany");
        Company company = new Company(7, "nCompany", "nDescription", "n98008008080", null);
        CompanyController instance = new CompanyController();
        int expResult = 1;
        int result = instance.updateCompany(company);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSelectVacancyForCompany() {
        System.out.println("CompanyController selectVacancyForCompany");
        CompanyController instance = new CompanyController();
        List<Vacancy> result = instance.selectVacancyForCompany(100);
        assertTrue(result != null);
    }

    @Test
    public void testDeleteCompany() {
        System.out.println("CompanyController deleteCompany");
        Company company = new Company(100, "Company", "Description", "98008008080", null);
        CompanyController instance = new CompanyController();
        int expResult = 1;
        int result = instance.deleteCompany(company);
        assertEquals(expResult, result);
    }

}
