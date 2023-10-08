package EX_01_26_03_2023;

import java.util.ArrayList;
import java.util.List;

public class Chef extends Cook implements Employee {
    List<Employee> employeeList;

    public Chef(String name, String position) {
        super(name, position);
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
        }

    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Manager: " + name + ", Position: " + position);
        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }
    }
}

