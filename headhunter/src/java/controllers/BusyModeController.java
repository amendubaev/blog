package controllers;

import DAL.BusyModeDAL;
import java.util.List;
import model.BusyMode;
import model.Vacancy;

public class BusyModeController {
    
    protected BusyModeDAL busymodeDal ;
    public BusyModeController() {
        busymodeDal =  new BusyModeDAL();
    }
    
    public List<Vacancy> selectVacancyForBM(int id)
    {
        return busymodeDal.selectVacancyForBM(id);
    }

    public List<BusyMode> getAllBusyMode()
    {
        return busymodeDal.selectAll();
    }
    
    public BusyMode getBusyModeById(int id)
    {
        return busymodeDal.selectById(id);
    }
    
    public int insertBusyMode(BusyMode busymode)
    {
        return busymodeDal.insert(busymode);
    }
    public int updateBusyMode(BusyMode busymode)
    {
        return busymodeDal.update(busymode);
    }
    
     public int deleteBusyMode(BusyMode busymode)
    {
        return busymodeDal.delete(busymode);
    }
}
