package model;

import java.util.Date;
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

    public Vacancy() {
    }

    public Vacancy(int id, String name, String description, Date date, int salary, String experience, BusyMode busymode, String location,
            Company company, Admin admin) {
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

    public String getLocation() {
        return location;
    }

    public Company getCompany() {
        return company;
    }

    public Admin getAdmin() {
        return admin;
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

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
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
        return true;
    }

    @Override
    public String toString() {
        return "Vacancy{" + "id=" + id + ", title=" + name + ", description=" + description + ", date=" + date + ", salary=" + salary + ", experience=" + experience
                + ", location=" + location + ", company=" + company + ", admin=" + admin + '}';
    }
}
