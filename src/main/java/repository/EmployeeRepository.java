package repository;

import model.Employee;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static util.Constants.*;

public class EmployeeRepository {

    private final List<Employee> store = new ArrayList<>();

    public void init() {

    }

    public Employee save(Employee employee) {
        employee.setId(generateId());
        store.add(employee);
        return employee;
    }

    public boolean update(long id, Employee employee) {
        int index = indexOf(id);
        boolean result = index != INCORRECT_INDEX;

        if (result) {
            employee.setId(id);
            store.set(index, employee);
        }

        return result;
    }

    public boolean delete(long id) {
        int index = indexOf(id);
        boolean result = index != INCORRECT_INDEX;

        if (result) {
            store.remove(index);
        }

        return result;
    }

    public Employee findById(long id) {
        int index = indexOf(id);
        return index != INCORRECT_INDEX
                ? store.get(index)
                : null;
    }

    public List<Employee> findAll() {
        return store;
    }

    public List<Employee> findByName(String name) {

        List<Employee> result = new ArrayList<>();

        for (Employee employee : store) {
            if (employee.getName().equals(name)) {
                result.add(employee);
            }
        }

        return result;
    }

    public List<Employee> findByCreatedDateInterval(LocalDateTime start, LocalDateTime end) {
        return null;
    }

    private int indexOf(long id) {
        int result = INCORRECT_INDEX;
        for (int index = 0; index < store.size(); index++) {
            if (store.get(index).getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    private long generateId() {
        return Math.abs(new Random().nextLong());
    }
}
