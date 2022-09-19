package actions.impl;

import actions.EmployeeAction;
import input.Input;
import model.Employee;
import service.EmployeeService;
import util.Assert;

public class CreateAction implements EmployeeAction {

    @Override
    public String name() {
        return "==== Create a new Employee ====";
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
            String name = input.askStr("Enter name: ");
            String city = input.askStr("Enter city: ");
            int age = Integer.parseInt(input.askStr("Enter age"));
            Employee employee = new Employee(name, city);
            return employeeService.save(employee);
    }
}
