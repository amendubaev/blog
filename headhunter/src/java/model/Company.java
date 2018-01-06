package model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {

    private int id;
    private String name;
    private String description;
    private String phone;
    private byte[] logo;
    private List<Vacancy> vacancy;

    public Company() {
        this.vacancy = new ArrayList<>();
    }

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
        this.vacancy = new ArrayList<>();
    }

    public Company(int id, String name, List<Vacancy> vacancy) {
        this.id = id;
        this.name = name;
        this.vacancy = vacancy;
    }

    public Company(int id, String name, String description, String phone, byte[] logo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.phone = phone;
        this.logo = logo;
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

    public String getPhone() {
        return phone;
    }

    public byte[] getLogo() {
        return logo;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
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
        final Company other = (Company) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.logo, other.logo)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + Objects.hashCode(this.phone);
        return hash;
    }

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", name=" + name + ", description=" + description + ", phone=" + phone + ", logo=" + logo + '}';
    }

}
