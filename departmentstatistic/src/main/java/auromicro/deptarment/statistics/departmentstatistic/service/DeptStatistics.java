package auromicro.deptarment.statistics.departmentstatistic.service;

import auromicro.deptarment.statistics.departmentstatistic.domain.Department;
import auromicro.deptarment.statistics.departmentstatistic.domain.Employee;
import auromicro.deptarment.statistics.departmentstatistic.domain.EmployeeByDept;
import auromicro.deptarment.statistics.departmentstatistic.repositry.DepartmentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptStatistics {
    @Autowired
    DepartmentRepositry departmentRepositry;

    public void storeStatistics(EmployeeByDept employeeByDept) {
        Department department = new Department();
        int count = 0;
        int deptId = 0;
        double sumSalary = Long.valueOf(0);
        double countMale = 0.0;
        double countFemale = 0;
        double minSalary = Long.valueOf(Integer.MAX_VALUE);
        double maxSalary = Long.valueOf(Integer.MIN_VALUE);


        for (Employee employee : employeeByDept.getEmployeeList()) {
            if (employee.getEmpSex().equals("Male")) {
                countMale++;
            } else
                countFemale++;

            if (minSalary > employee.getEmpSalary())
                minSalary = employee.getEmpSalary();

            if (maxSalary < employee.getEmpSalary())
                maxSalary = employee.getEmpSalary();

            sumSalary += employee.getEmpSalary();

            deptId = employee.getEmpDeptId();

            count++;
        }
        department.setDeptMaleRation(countMale / count * 100);
        department.setDeptFemaleRatio(countFemale / count * 100);
        department.setDeptId(deptId);
        department.setDeptHighSalary(maxSalary);
        department.setDeptLowSalary(minSalary);
        department.setDeptAvgSalary(sumSalary / count);
        departmentRepositry.save(department);

    }
}
