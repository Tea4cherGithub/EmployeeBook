package actions.impl;

import actions.EmployeeAction;
import input.Input;
import service.EmployeeService;

public class UpdateAction implements EmployeeAction {

    @Override
    public String name() {
        return "==== Update Employee ====";
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
        return false;
    }
}
