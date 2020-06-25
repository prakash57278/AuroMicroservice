package auromicro.login.registration.loginregistration.controller;

import auromicro.login.registration.loginregistration.domain.Employee;
import auromicro.login.registration.loginregistration.domain.EmployeeByDept;
import auromicro.login.registration.loginregistration.domain.Login;
import auromicro.login.registration.loginregistration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/signup", produces = {"application/json"})
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.create(employee);

    }

    @PostMapping(value = "/login", produces = {"application/json"})
    public Employee loginEmployee(@RequestBody Login login) {
        return employeeService.login(login);

    }

    @PutMapping(value = "/empupdate/{empId}", produces = {"application/json"})
//    @CachePut(value = "employees",key = "#empId")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployeeDetails(employee);
    }

    @GetMapping(value = "/employee/{empId}", produces = {"application/json"})
//    @Cacheable(value = "employee",key = "#empId")
    public Optional<Employee> getEmpById(@PathVariable("empId") int empId) {
        return employeeService.getEmployeeById(empId);
    }

    @GetMapping(value = "/employee1/{empDeptId}", produces = {"application/json"})
//    @Cacheable(value = "employeeByDept",key = "#empDeptId")
    public EmployeeByDept getEmpByDeptId(@PathVariable("empDeptId") int empDeptId) {
        EmployeeByDept employeeByDept = new EmployeeByDept();
        employeeByDept.setEmployeeList(employeeService.getEmployeeByDeptId(empDeptId));
        return employeeByDept;
    }

}
