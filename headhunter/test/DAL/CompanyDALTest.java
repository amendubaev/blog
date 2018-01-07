package DAL;

import java.util.List;
import model.Company;
import model.Vacancy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class CompanyDALTest {
    
    public CompanyDALTest() {
    }
    
    @Test
    public void testSelectAll() {
        System.out.println("CompanyDal selectAll");
        CompanyDAL instance = new CompanyDAL();
        List<Company> result = instance.selectAll();
        assertTrue(result != null && result.size() > 0);
    }

    @Test
    public void testSelectById() {
        System.out.println("CompanyDal selectById");
        int id = 1;
        CompanyDAL instance = new CompanyDAL();
        Company result = instance.selectById(id);
        assertTrue(result != null);
    }
    
    @Test
    public void testInsert() {
        System.out.println("insert");
        Company company = new Company(100, "Company", "Description", "98008008080", null);
        CompanyDAL instance = new CompanyDAL();
        int expResult = 1;
        int result = instance.insert(company);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSelectVacancyForCompany() {
        System.out.println("CompanyDal selectVacancyForCompany");
        CompanyDAL instance = new CompanyDAL();
        List<Vacancy> result = instance.selectVacancyForCompany(100);
        assertTrue(result != null);
    }
    

    @Test
    public void testUpdate() {
        System.out.println("update");
        Company company = new Company(100, "Company", "Description", "98008008080", null);
        CompanyDAL instance = new CompanyDAL();
        int expResult = 1;
        int result = instance.update(company);
        assertEquals(expResult, result);
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Company company = new Company(100, "Company", "Description", "98008008080", null);
        CompanyDAL instance = new CompanyDAL();
        int expResult = 1;
        int result = instance.delete(company);
        assertEquals(expResult, result);
    }
   
}
