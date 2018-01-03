package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CategoryTest {

    public CategoryTest() {
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
     * Test of equals method, of class Category.
     */
    @Test
    public void testCreateCategory() {
        System.out.println("create category");
        BusyMode busymode = new BusyMode(1, "Full time");
        Company company = new Company(1, "Sberbank", "description", "+123456", null);
        Date date = new Date(2018, 01, 03);
        Admin admin = new Admin(1, "login", "password");
        
        Vacancy vacancy1 = new Vacancy(1, "title1", "descr1", date, 20000, "1 year", busymode, "Omsk", company, admin);
        Vacancy vacancy2 = new Vacancy(2, "title2", "descr2", date, 25000, "2 years", busymode, "Omsk", company, admin);
        Vacancy vacancy3 = new Vacancy(3, "title3", "descr3", date, 28000, "3 years", busymode, "Omsk", company, admin);

        List<Vacancy> vacancySet = new ArrayList<>();
        vacancySet.add(vacancy1);
        vacancySet.add(vacancy2);
        vacancySet.add(vacancy3);

        Category category = new Category(1, "name", vacancySet);

        assertEquals(category.getId(), 1);
        assertEquals(category.getName(), "name");
        assertEquals(category.getVacancy().size(), vacancySet.size());
        assertTrue(category.getVacancy().containsAll(vacancySet));
    }

    /**
     * Test of equals method, of class Category.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");

        BusyMode busymode = new BusyMode(1, "Full time");
        Company company = new Company(1, "Sberbank", "description", "+123456", null);
        Date date = new Date(2018, 01, 03);
        Admin admin = new Admin(1, "login", "password");

        Vacancy vacancy1 = new Vacancy(1, "title1", "descr1", date, 20000, "1 year", busymode, "Omsk", company, admin);
        Vacancy vacancy2 = new Vacancy(2, "title2", "descr2", date, 25000, "2 year", busymode, "Omsk", company, admin);
        Vacancy vacancy3 = new Vacancy(3, "title3", "descr3", date, 28000, "3 year", busymode, "Omsk", company, admin);

        List<Vacancy> vacancySet1 = new ArrayList<>();
        vacancySet1.add(vacancy1);
        vacancySet1.add(vacancy2);
        vacancySet1.add(vacancy3);
        
        List<Vacancy> vacancySet2 = new ArrayList<>();
        vacancySet2.add(vacancy1);
        vacancySet2.add(vacancy2);
        vacancySet2.add(vacancy3);

        Category category1 = new Category(1, "name", vacancySet1);
        Category category2 = new Category(1, "name", vacancySet2);
        assertTrue(category1.equals(category2));
    }

}
