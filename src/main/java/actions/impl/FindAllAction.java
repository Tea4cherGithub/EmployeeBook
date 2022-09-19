package actions.impl;

import actions.EmployeeAction;
import dto.EmployeeDto;
import input.Input;
import service.EmployeeService;

public class FindAllAction implements EmployeeAction {

    @Override
    public String name() {
        return "==== Find all Employees ====";
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
        for (EmployeeDto employee : employeeService.findAll()) {
            System.out.println(employee);
        }
        return true;
    }
}
