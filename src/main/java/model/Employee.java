package model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Employee {

    private long id;

    private String name;

    private String city;

    private final LocalDateTime created;

    public Employee(String name, String city) {
        this.name = name;
        this.city = city;
        this.created = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id
                && Objects.equals(name, employee.name)
                && Objects.equals(city, employee.city)
                && Objects.equals(created, employee.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city, created);
    }
}
