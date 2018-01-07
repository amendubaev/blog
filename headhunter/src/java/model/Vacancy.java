package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Vacancy {

    private int id;
    private String name;
    private String description;
    private Date date;
    private int salary;
    private String experience;
    private BusyMode busymode;
    private String location;
    private Company company;
    private Admin admin;
    private Category category;
    private int id_busymode;
    private int id_company;
    private int id_category;
    private int id_admin;
    
    public Vacancy(){
    }
    
    public Vacancy(int id, String name, String description, Date date, int salary, String experience,  String location, BusyMode busymode,
            Company company, Category category, Admin admin) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.salary = salary;
        this.experience = experience;
        this.busymode = busymode;
        this.location = location;
        this.company = company;
        this.admin = admin;
        this.category = category;
    }
    
    public Vacancy(int id, String name, String description, Date date, int salary, String experience,  String location, int id_busymode,
            int id_company, int id_category, int id_admin) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.salary = salary;
        this.experience = experience;
        this.id_busymode = id_busymode;
        this.location = location;
        this.id_company = id_company;
        this.id_admin = id_admin;
        this.id_category = id_category;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public int getSalary() {
        return salary;
    }

    public String getExperience() {
        return experience;
    }

    public BusyMode getBusymode() {
        return busymode;
    }
    
    public int getBusymodeID() {
        return id_busymode;
    }

    public String getLocation() {
        return location;
    }

    public Company getCompany() {
        return company;
    }

    public int getCompanyID() {
        return id_company;
    }
    
    public Admin getAdmin() {
        return admin;
    }
    
    public int getAdminID() {
        return id_admin;
    }
    
    public Category getCategory() {
        return category;
    }
    
    public int getCategoryID() {
        return id_category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setBusymode(BusyMode busymode) {
        this.busymode = busymode;
    }

    public void setBusymodeID(int id_busymode) {
        this.id_busymode = id_busymode;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    
    public void setCompanyID(int id_company) {
        this.id_company = id_company;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    public void setAdminID(int id_admin) {
        this.id_admin = id_admin;
    }

     public void setCategory(Category category) {
        this.category = category;
    }
    
    public void setCategoryID(int id_category) {
        this.id_category = id_category;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.admin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vacancy other = (Vacancy) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.company, other.company)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vacancy{" + "id=" + id + ", title=" + name + ", description=" + description + ", date=" + date + ", salary=" + salary + ", experience=" + experience
                + ", location=" + location + ",busymode=" + busymode + ", company=" + company + ", category=" + category + ", admin=" + admin +'}';
    }
}
