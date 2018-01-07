package DAL;

import java.util.Date;
import java.util.List;
import model.Admin;
import model.BusyMode;
import model.Category;
import model.Company;
import model.Vacancy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class VacancyDALTest {
    
    public VacancyDALTest() {
    }
    
    @Test
    public void testSelectAll() {
        System.out.println("VacancyDal selectAll");
        VacancyDAL instance = new VacancyDAL();
        List<Vacancy> result = instance.selectAll();
        assertTrue(result != null && result.size() > 0);
    }

    @Test
    public void testSelectById() {
        System.out.println("VacancyDal selectById");
        int id = 1;
        VacancyDAL instance = new VacancyDAL();
        Vacancy result = instance.selectById(id);
        assertTrue(result != null);
    }
    
    @Test
    public void testInsert() {
        System.out.println("insert");
        Date date = new Date();
        Company company = new Company(100, "Company", "Description", "98008008080", null);
        Category category = new Category(100, "Category");
        BusyMode busymode = new BusyMode(100, "BusyMode");
        Admin admin = new Admin(100, "user", "password");
        Vacancy vacancy = new Vacancy(100, "Name","Description",date,10000,"experience","Omsk", 1, 1, 1, 1);
        VacancyDAL instance = new VacancyDAL();
        int expResult = 1;
        int result = instance.insert(vacancy);
        assertEquals(expResult, result);
    }
 /*   
    @Test
    public void testselectVacancyForCompany() {
        System.out.println("VacancyDal selectVacancyForCompany");
        VacancyDAL instance = new VacancyDAL();
        List<Company> result = instance.selectVacancyForCompany(100);
        assertTrue(result != null);
    }
    
    @Test
    public void testselectVacancyForCategory() {
        System.out.println("VacancyDal selectVacancyForCompany");
        VacancyDAL instance = new VacancyDAL();
        List<Category> result = instance.selectVacancyForCategory(100);
        assertTrue(result != null);
    }
    
    @Test
    public void testselectVacancyForBM() {
        System.out.println("VacancyDal selectVacancyForCompany");
        VacancyDAL instance = new VacancyDAL();
        List<BusyMode> result = instance.selectVacancyForBM(100);
        assertTrue(result != null);
    }
    
*/
    @Test
    public void testUpdate() {
        System.out.println("insert");
        Date date = new Date();
        Company company = new Company(100, "Company", "Description", "98008008080", null);
        Category category = new Category(100, "Category");
        BusyMode busymode = new BusyMode(100, "BusyMode");
        Admin admin = new Admin(100, "user", "password");
        Vacancy vacancy = new Vacancy(100, "Name","Description",date,10000,"experience","Omsk", busymode, company, category, admin);
        VacancyDAL instance = new VacancyDAL();
        int expResult = 1;
        int result = instance.update(vacancy);
        assertEquals(expResult, result);
    }

    @Test
    public void testDelete() {
         System.out.println("insert");
        Date date = new Date();
        Company company = new Company(100, "Company", "Description", "98008008080", null);
        Category category = new Category(100, "Category");
        BusyMode busymode = new BusyMode(100, "BusyMode");
        Admin admin = new Admin(100, "user", "password");
        Vacancy vacancy = new Vacancy(100, "Name","Description",date,10000,"experience","Omsk", busymode, company, category, admin);
        VacancyDAL instance = new VacancyDAL();
        int expResult = 1;
        int result = instance.delete(vacancy);
        assertEquals(expResult, result);
    }
}
