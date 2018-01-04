package model;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BusyModeTest {

    public BusyModeTest() {
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
     * Test of equals method, of class BusyMode.
     */
    @Test
    public void testCreateBusyMode() {
        System.out.println("create busymode");

        BusyMode busymode = new BusyMode(1, "full_time");

        assertEquals(busymode.getId(), 1);
        assertEquals(busymode.getName(), "full_time");

        busymode.setId(2);
        assertEquals(busymode.getId(), 2);

        busymode.setName("underemployment");
        assertEquals(busymode.getName(), "underemployment");
    }

    /**
     * Test of equals method, of class BusyMode.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");

        BusyMode busymode1 = new BusyMode(1, "full_time");
        BusyMode busymode2 = new BusyMode(1, "full_time");
        assertTrue(busymode1.equals(busymode2));

        busymode1 = new BusyMode(1, "full_time");
        busymode2 = new BusyMode(2, "full_time");
        assertFalse(busymode1.equals(busymode2));

        busymode1 = new BusyMode(1, "full_time");
        busymode2 = new BusyMode(1, "underemployment");
        assertFalse(busymode1.equals(busymode2));

        busymode1 = new BusyMode(1, "student");
        busymode2 = new BusyMode(2, "night");
        assertFalse(busymode1.equals(busymode2));

    }

}
