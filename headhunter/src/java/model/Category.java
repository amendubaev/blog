package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Category {

    private int id;
    private String name;
    private List<Vacancy> vacancy;

    public Category() {
        this.vacancy = new ArrayList<>();
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
        this.vacancy = new ArrayList<>();
    }

    public Category(int id, String name, List<Vacancy> vacancy) {
        this.id = id;
        this.name = name;
        this.vacancy = vacancy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Vacancy> getVacancy() {
        return vacancy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVacancy(List<Vacancy> vacancy) {
        this.vacancy = vacancy;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final Category other = (Category) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + '}';
    }

}
