/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Date;
import java.util.List;
import model.Company;
import model.Vacancy;
import model.BusyMode;
import model.Category;
import model.Admin;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class VacancyControllerTest {
 
      public VacancyControllerTest() {
    }

//    @Test
//    public void testGetAllVacancy() {
//        System.out.println("VacancyController getAllVacancy");
//        VacancyController instance = new VacancyController();
//        List<Vacancy> result = instance.getAllVacancy();
//        assertTrue(result != null && result.size() >= 1);
//    }
//
//    @Test
//    public void testGetVacancyById() {
//        System.out.println("VacancyController getVacancyById");
//        int id = 1;
//        VacancyController instance = new VacancyController();
//        Vacancy result = instance.getVacancyById(id);
//        assertTrue(result != null && result.getId() == 1);
//    }
//
    @Test
    public void testInsertVacancy() {
        System.out.println("VacancyController insertVacancy");
        Date date = new Date();
        Company company = new Company(100, "Company", "Description", "98008008080", null);
        Category category = new Category(100, "Category");
        BusyMode busymode = new BusyMode(100, "BusyMode");
        Admin admin = new Admin(100, "user", "password");
        int id_busymode = 1;
        int id_company = 1;
        int id_category = 1;
        int id_admin = 1;
        
        Vacancy vacancy = new Vacancy(100, "Name","Description",date,10000,"experience","location",id_busymode,id_company,id_category,id_admin);
        VacancyController instance = new VacancyController();
        int expResult = 1;
        int result = instance.insertVacancy(vacancy);
        assertEquals(expResult, result);
    }
//    
//    @Test
//    public void testUpdateVacancy() {
//        System.out.println("VacancyController updateVacancy");
//        Date date = new Date();
//        Company company = new Company(100, "Company", "Description", "98008008080", null);
//        Category category = new Category(100, "Category");
//        BusyMode busymode = new BusyMode(100, "BusyMode");
//        Admin admin = new Admin(100, "user", "password");
//        Vacancy vacancy = new Vacancy(100, "nName","nDescription",date,10000,"nexperience",busymode,"nlocation",company,admin,category);
//        VacancyController instance = new VacancyController();
//        int expResult = 1;
//        int result = instance.updateVacancy(vacancy);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testDeleteVacancy() {
//        System.out.println("VacancyController deleteVacancy");
//        Date date = new Date();
//        Company company = new Company(100, "Company", "Description", "98008008080", null);
//        Category category = new Category(100, "Category");
//        BusyMode busymode = new BusyMode(100, "BusyMode");
//        Admin admin = new Admin(100, "user", "password");
//        Vacancy vacancy = new Vacancy(100, "nName","nDescription",date,10000,"nexperience",busymode,"nlocation",company,admin,category);
//        VacancyController instance = new VacancyController();
//        int expResult = 1;
//        int result = instance.deleteVacancy(vacancy);
//        assertEquals(expResult, result);
//    }

    
}
