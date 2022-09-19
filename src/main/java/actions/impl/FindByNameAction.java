package actions.impl;

import actions.EmployeeAction;
import input.Input;
import service.EmployeeService;

public class FindByNameAction implements EmployeeAction {

    @Override
    public String name() {
        return "==== Find Employees By Name ====";
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
        return false;
    }
}
