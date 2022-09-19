package service;

import dto.EmployeeDto;
import model.Employee;
import repository.EmployeeRepository;
import util.Constants;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public boolean save(Employee employee) {
        return employeeRepository.save(employee).getId() != 0;
    }

    public boolean update(long id, Employee employee) {
        return employeeRepository.update(id, employee);
    }

    public boolean delete(long id) {
        return employeeRepository.delete(id);
    }

    public List<EmployeeDto> findAll() {

        List<EmployeeDto> result = new ArrayList<>();

        for (Employee employee : employeeRepository.findAll()) {
            result.add(EmployeeDto.builder()
                            .city(employee.getCity())
                            .created(employee.getCreated())
                            .name(employee.getName())
                            .build());
        }

        return result;
    }

    public List<EmployeeDto> findAllByName(String name) {

        List<EmployeeDto> result = new ArrayList<>();

        for (Employee employee : employeeRepository.findByName(name)) {
            result.add(EmployeeDto.builder()
                    .city(employee.getCity())
                    .created(employee.getCreated())
                    .name(employee.getName())
                    .build());
        }

        return result;
    }
}
