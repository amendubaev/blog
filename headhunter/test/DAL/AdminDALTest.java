package DAL;

import java.util.List;
import model.Admin;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class AdminDALTest {

    public AdminDALTest() {
    }

    @Test
    public void testSelectAll() {
        System.out.println("AdminDal selectAll");
        AdminDAL instance = new AdminDAL();
        List<Admin> result = instance.selectAll();
        assertTrue(result != null && result.size() > 0);
    }

    @Test
    public void testSelectById() {
        System.out.println("AdminDal selectById");
        int id = 1;
        AdminDAL instance = new AdminDAL();
        Admin result = instance.selectById(id);
        assertTrue(result != null);
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Admin admin = new Admin(100, "user", "password");
        AdminDAL instance = new AdminDAL();
        int expResult = 1;
        int result = instance.insert(admin);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Admin admin = new Admin(100, "newuser", "newpassword");
        AdminDAL instance = new AdminDAL();
        int expResult = 1;
        int result = instance.update(admin);
        assertEquals(expResult, result);
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Admin admin = new Admin(100, null, null);
        AdminDAL instance = new AdminDAL();
        int expResult = 1;
        int result = instance.delete(admin);
        assertEquals(expResult, result);
    }

}
