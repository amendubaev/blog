package controllers;

import java.util.List;
import model.BusyMode;
import model.Vacancy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BusyModeControllerTest {

    public BusyModeControllerTest() {
    }

    @Test
    public void testGetAllBusyMode() {
        System.out.println("BusyModeController getAllBusyMode");
        BusyModeController instance = new BusyModeController();
        List<BusyMode> result = instance.getAllBusyMode();
        assertTrue(result != null && result.size() >= 1);
    }

    @Test
    public void testGetBusyModeById() {
        System.out.println("BusyModeController getBusyModeById");
        int id = 1;
        BusyModeController instance = new BusyModeController();
        BusyMode result = instance.getBusyModeById(id);
        assertTrue(result != null && result.getId() == 1);
    }

    @Test
    public void testInsertBusyMode() {
        System.out.println("BusyModeController insertBusyMode");
        BusyMode busymode = new BusyMode(100, "BusyMode");
        BusyModeController instance = new BusyModeController();
        int expResult = 1;
        int result = instance.insertBusyMode(busymode);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testUpdateBusyMode() {
        System.out.println("BusyModeController updateBusyMode");
        BusyMode busymode = new BusyMode(100, "nBusyMode");
        BusyModeController instance = new BusyModeController();
        int expResult = 1;
        int result = instance.updateBusyMode(busymode);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSelectVacancyForBM() {
        System.out.println("BusyModeController selectVacancyForBM");
        BusyModeController instance = new BusyModeController();
        List<Vacancy> result = instance.selectVacancyForBM(100);
        assertTrue(result != null);
    }

    @Test
    public void testDeleteBusyMode() {
        System.out.println("BusyModeController deleteBusyMode");
        BusyMode busymode = new BusyMode(100, null);
        BusyModeController instance = new BusyModeController();
        int expResult = 1;
        int result = instance.deleteBusyMode(busymode);
        assertEquals(expResult, result);
    }

}
