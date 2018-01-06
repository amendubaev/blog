/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAL.BusyModeDAL;
import java.util.List;
import model.BusyMode;
import model.Vacancy;

/**
 *
 * @author greypk
 */
public class BusyModeController {
    protected BusyModeDAL busymodeDal ;
    public BusyModeController() {
        busymodeDal =  new BusyModeDAL();
    }
    
    public List<Vacancy> selectVacancyForBM()
    {
        return busymodeDal.selectVacancyForBM();
    }

    public List<BusyMode> selectAll()
    {
        return busymodeDal.selectAll();
    }
    
    public BusyMode selectById(int id)
    {
        return busymodeDal.selectById(id);
    }
    
    public int insert(BusyMode busymode)
    {
        return busymodeDal.insert(busymode);
    }
    public int update(BusyMode busymode)
    {
        return busymodeDal.update(busymode);
    }
    
     public int delete(BusyMode busymode)
    {
        return busymodeDal.delete(busymode);
    }
}
