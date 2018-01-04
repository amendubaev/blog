package model;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CompanyTest {

    public CompanyTest() {
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

    @Test
    public void testCreateCompany() {
        System.out.println("create company");

        Company company = new Company(1, "OMGTU", "description", "89001231242", null);

        assertEquals(company.getId(), 1);
        assertEquals(company.getName(), "OMGTU");
        assertEquals(company.getDescription(), "description");
        assertEquals(company.getPhone(), "89001231242");
        assertEquals(company.getImage(), null);
    }

    @Test
    public void testEquals() {
        System.out.println("equals");

        Company company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        Company company2 = new Company(1, "OMGTU", "description", "89001231242", null);

        assertTrue(company1.equals(company2));

        company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        company2 = new Company(2, "OMGTU", "description", "89001231242", null);

        assertFalse(company1.equals(company2));

        company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        company2 = new Company(1, "another_company", "description", "89001231242", null);

        assertFalse(company1.equals(company2));

        company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        company2 = new Company(1, "OMGTU", "another_description", "89001231242", null);

        assertFalse(company1.equals(company2));

        company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        company2 = new Company(1, "OMGTU", "description", "82223333212", null);

        assertFalse(company1.equals(company2));

        company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        company2 = new Company(2, "another_company", "description", "89001231242", null);

        assertFalse(company1.equals(company2));

        company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        company2 = new Company(2, "another_company", "description", "89001231242", null);

        assertFalse(company1.equals(company2));

        company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        company2 = new Company(2, "company", "another_description", "89001231242", null);

        assertFalse(company1.equals(company2));

        company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        company2 = new Company(2, "company", "description", "82223333212", null);

        assertFalse(company1.equals(company2));

        company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        company2 = new Company(2, "another_company", "description", "82223333212", null);

        assertFalse(company1.equals(company2));

        company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        company2 = new Company(2, "another_company", "another_description", "89001231242", null);

        assertFalse(company1.equals(company2));

        company1 = new Company(1, "OMGTU", "description", "89001231242", null);
        company2 = new Company(2, "another_company", "another_description", "82223333212", null);

        assertFalse(company1.equals(company2));
    }

}
