package model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VacancyTest {

    public VacancyTest() {
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
    public void testCreateVacancy() {
        System.out.println("create vacancy");
        BusyMode busymode = new BusyMode(1, "Full time");
        Company company = new Company(1, "Sberbank", "description", "+123456", null);
        Date date = new Date(2018, 01, 03);
        Admin admin = new Admin(1, "login", "password");
        Category category = new Category(1, "name");

        Vacancy vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);

        assertEquals(vacancy.getId(), 1);
        assertEquals(vacancy.getName(), "teacher");
        assertEquals(vacancy.getDescription(), "description");
        assertEquals(vacancy.getDate(), date);
        assertEquals(vacancy.getSalary(), 20000);
        assertEquals(vacancy.getExperience(), "1 year");
        assertEquals(vacancy.getBusymode(), busymode);
        assertEquals(vacancy.getLocation(), "Omsk");
        assertEquals(vacancy.getCompany(), company);
        assertEquals(vacancy.getAdmin(), admin);
        assertEquals(vacancy.getCategory(), category);
    }

    @Test
    public void testEquals() {
        BusyMode busymode = new BusyMode(1, "Full time");
        BusyMode busymode2 = new BusyMode(1, "Half time");
        Company company = new Company(1, "Sberbank", "description", "+123456", null);
        Company company2 = new Company(2, "Tinkoff", "description", "+123456", null);
        Date date = new Date(2018, 01, 03);
        Date date2 = new Date(2018, 01, 04);
        Admin admin = new Admin(1, "login", "password");
        Admin admin2 = new Admin(2, "name", "password");
        Category category = new Category(1, "name");
        Category category2 = new Category(2, "category");

        System.out.println("equals");

        Vacancy vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);
        Vacancy vacancy2 = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);

        assertTrue(vacancy.equals(vacancy2));

        vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);
        vacancy2 = new Vacancy(2, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);

        assertFalse(vacancy.equals(vacancy2));

        vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);
        vacancy2 = new Vacancy(2, "doctor", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);

        assertFalse(vacancy.equals(vacancy2));

        vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);
        vacancy2 = new Vacancy(1, "doctor", "desc", date2, 50000, "2 year","Moscow",  busymode2, company2, category2, admin2);

        assertFalse(vacancy.equals(vacancy2));

        vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);
        vacancy2 = new Vacancy(1, "doctor", "desc", date, 50000, "1 year", "Omsk", busymode, company, category, admin);

        assertFalse(vacancy.equals(vacancy2));

        vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);
        vacancy2 = new Vacancy(1, "doctor", "desc", date2, 50000, "1 year", "Omsk", busymode, company, category, admin);

        assertFalse(vacancy.equals(vacancy2));

        vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);
        vacancy2 = new Vacancy(2, "doctor", "desc", date, 20000, "1 year", "Omsk", busymode2, company, category, admin);

        assertFalse(vacancy.equals(vacancy2));

        vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);
        vacancy2 = new Vacancy(2, "teacher", "description", date, 20000, "1 year", "Moscow", busymode, company, category, admin);

        assertFalse(vacancy.equals(vacancy2));

        vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year","Omsk", busymode, company, category, admin);
        vacancy2 = new Vacancy(2, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company2, category, admin);

        assertFalse(vacancy.equals(vacancy2));

        vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);
        vacancy2 = new Vacancy(2, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin2);

        assertFalse(vacancy.equals(vacancy2));

        vacancy = new Vacancy(1, "teacher", "description", date, 20000, "1 year", "Omsk", busymode, company, category, admin);
        vacancy2 = new Vacancy(2, "teacher", "description", date, 550000, "1 year", "Omsk", busymode, company, category2, admin);

        assertFalse(vacancy.equals(vacancy2));

    }

}
