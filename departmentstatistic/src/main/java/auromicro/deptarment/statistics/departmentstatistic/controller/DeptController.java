package auromicro.deptarment.statistics.departmentstatistic.controller;

import auromicro.deptarment.statistics.departmentstatistic.domain.Department;
import auromicro.deptarment.statistics.departmentstatistic.domain.EmployeeByDept;
import auromicro.deptarment.statistics.departmentstatistic.service.DeptStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
