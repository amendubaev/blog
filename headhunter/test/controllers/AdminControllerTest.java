package controllers;

import java.util.List;
import model.Admin;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AdminControllerTest {

    public AdminControllerTest() {
    }

    @Test
    public void testGetAllAdmin() {
        System.out.println("AdminController getAllAdmin");
        AdminController instance = new AdminController();
        List<Admin> result = instance.getAllAdmin();
        assertTrue(result != null && result.size() >= 1);
    }

    @Test
    public void testGetAdminById() {
        System.out.println("AdminController getAdminById");
        int id = 1;
        AdminController instance = new AdminController();
        Admin result = instance.getAdminById(id);
        assertTrue(result != null && result.getId() == 1);
    }

    @Test
    public void testInsertAdmin() {
        System.out.println("AdminController insertAdmin");
        Admin admin = new Admin(100, "user", "password");
        AdminController instance = new AdminController();
        int expResult = 1;
        int result = instance.insertAdmin(admin);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdateAdmin() {
        System.out.println("AdminController updateAdmin");
        Admin admin = new Admin(1, "newuser", "newpassword");
        AdminController instance = new AdminController();
        int expResult = 1;
        int result = instance.updateAdmin(admin);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeleteAdmin() {
        System.out.println("AdminController deleteAdmin");
        Admin admin = new Admin(100, null, null);
        AdminController instance = new AdminController();
        int expResult = 1;
        int result = instance.deleteAdmin(admin);
        assertEquals(expResult, result);
    }

}
