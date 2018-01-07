
package DAL;

import java.util.List;
import model.BusyMode;
import model.Vacancy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class BusyModeDALTest {
    
    public BusyModeDALTest() {
    }

    @Test
    public void testSelectAll() {
        System.out.println("BusyModeDal selectAll");
        BusyModeDAL instance = new BusyModeDAL();
        List<BusyMode> result = instance.selectAll();
        assertTrue(result != null && result.size() > 0);
    }

    @Test
    public void testSelectById() {
        System.out.println("BusyModeDal selectById");
        int id = 1;
        BusyModeDAL instance = new BusyModeDAL();
        BusyMode result = instance.selectById(id);
        assertTrue(result != null);
    }
    
    @Test
    public void testSelectVacancyForBM() {
        System.out.println("BusyModeDal selectVacancyForBM");
        BusyModeDAL instance = new BusyModeDAL();
        List<Vacancy> result = instance.selectVacancyForBM(1);
        assertTrue(result != null);
    }
    
    @Test
    public void testInsert() {
        System.out.println("insert");
        BusyMode busymode = new BusyMode(100, "Model");
        BusyModeDAL instance = new BusyModeDAL();
        int expResult = 1;
        int result = instance.insert(busymode);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        BusyMode busymode = new BusyMode(100, "Model");
        BusyModeDAL instance = new BusyModeDAL();
        int expResult = 1;
        int result = instance.update(busymode);
        assertEquals(expResult, result);
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        BusyMode busymode = new BusyMode(100, null, null);
        BusyModeDAL instance = new BusyModeDAL();
        int expResult = 1;
        int result = instance.delete(busymode);
        assertEquals(expResult, result);
    }

}
