package employee.manage.employeemanagement.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class EmployeeByDept {
    public List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
