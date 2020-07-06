package departmentstatistics.department.controller;


import departmentstatistics.department.domain.EmployeeByDept;
import departmentstatistics.department.service.DeptStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {

    @Autowired
    DeptStatistics deptStatistics;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/dept/{deptId}", produces = {"application/json"})
    public void addDeptStatistics(@PathVariable("deptId") int depId) {
        EmployeeByDept employeeByDept = restTemplate.getForObject("http://localhost:8080/api/employee1/" + depId, EmployeeByDept.class);
        deptStatistics.storeStatistics(employeeByDept);
    }

}
