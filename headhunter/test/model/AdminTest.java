package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdminTest {

    public AdminTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of equals method, of class Admin.
     */
    @Test
    public void testCreateAdmin() {
        System.out.println("create admin");

        Admin admin = new Admin(1, "user", "password");

        assertEquals(admin.getId(), 1);
        assertEquals(admin.getLogin(), "user");
        assertEquals(admin.getPassword(), "password");

        admin.setId(2);
        assertEquals(admin.getId(), 2);

        admin.setLogin("123");
        assertEquals(admin.getLogin(), "123");

        admin.setPassword("123");
        assertEquals(admin.getPassword(), "123");
    }

    /**
     * Test of equals method, of class Admin.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");

        Admin admin1 = new Admin(1, "user", "password");
        Admin admin2 = new Admin(1, "user", "password");
        assertTrue(admin1.equals(admin2));

        admin1 = new Admin(1, "user", "password");
        admin2 = new Admin(2, "user", "password");
        assertFalse(admin1.equals(admin2));

        admin1 = new Admin(1, "user1", "password");
        admin2 = new Admin(1, "user2", "password");
        assertFalse(admin1.equals(admin2));

        admin1 = new Admin(1, "user", "password1");
        admin2 = new Admin(1, "user", "password2");
        assertFalse(admin1.equals(admin2));

        admin1 = new Admin(1, "user2", "password1");
        admin2 = new Admin(2, "user3", "password2");
        assertFalse(admin1.equals(admin2));
    }
}
