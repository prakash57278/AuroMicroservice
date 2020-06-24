package auromicro.login.registration.loginregistration.service;

import auromicro.login.registration.loginregistration.domain.Employee;
import auromicro.login.registration.loginregistration.domain.Login;
import auromicro.login.registration.loginregistration.repositry.EmployeeRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepositry employeeRepositry;

    public Employee create(Employee employee) {
        return employeeRepositry.save(employee);

    }

    public Employee login(Login login) {
        Employee loginEmp = employeeRepositry.findByEmpContact(login.getUserId());
        if (login.getUserPassword().equals(loginEmp.getEmpContact())) {
            return loginEmp;
        } else {
            System.out.println("Not Found");
            return null;
        }
    }

    public Employee updateEmployeeDetails(Employee employee) {
        return employeeRepositry.save(employee);
    }

    public Optional<Employee> getEmployeeById(int empId) {
        return employeeRepositry.findById(empId);
    }
}
