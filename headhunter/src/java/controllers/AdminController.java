
package controllers;

import DAL.AdminDAL;
import java.util.List;
import model.Admin;

public class AdminController {

    protected AdminDAL adminDal ;
    public AdminController() {
        adminDal =  new AdminDAL();
    }
    
    public List<Admin> getAllAdmin()
    {
        return adminDal.selectAll();
    }
    
    public Admin getAdminById(int id)
    {
        return adminDal.selectById(id);
    }
    
    public int insertAdmin(Admin admin)
    {
        return adminDal.insert(admin);
    }
    public int updateAdmin(Admin admin)
    {
        return adminDal.update(admin);
    }
    
     public int deleteAdmin(Admin admin)
    {
        return adminDal.delete(admin);
    }
}

