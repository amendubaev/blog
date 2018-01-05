package DAL;

import java.util.List;
import model.Admin;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Gerune
 */
public class AdminDALTest {
    
    public AdminDALTest() {
    }

    /**
     * Test of selectAll method, of class AdminDAL.
     */
    @Test
    public void testSelectAll() {
        System.out.println("AdminDal selectAll");
        AdminDAL instance = new AdminDAL();
        List<Admin> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
    }

    /**
     * Test of selectById method, of class AdminDAL.
     */
    @Test
    public void testSelectById() {
        System.out.println("AdminDal selectById");
        int id = 1;
        AdminDAL instance = new AdminDAL();
        Admin result = instance.selectById(id);
        assertTrue(result!=null);
    }

    /**
     * Test of insert method, of class AdminDAL.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Admin admin = null;
        AdminDAL instance = new AdminDAL();
        int expResult = 0;
        int result = instance.insert(admin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AdminDAL.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Admin admin = null;
        AdminDAL instance = new AdminDAL();
        int expResult = 0;
        int result = instance.update(admin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AdminDAL.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Admin admin = null;
        AdminDAL instance = new AdminDAL();
        int expResult = 0;
        int result = instance.delete(admin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
