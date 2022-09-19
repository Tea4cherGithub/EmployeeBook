package actions.impl;

import actions.EmployeeAction;
import input.Input;
import service.EmployeeService;

public class FindByIdAction implements EmployeeAction {

    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
        return false;
    }
}
