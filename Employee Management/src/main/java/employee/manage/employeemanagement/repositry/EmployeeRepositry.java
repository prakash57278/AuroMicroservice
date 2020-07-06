package employee.manage.employeemanagement.repositry;



import employee.manage.employeemanagement.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepositry extends MongoRepository<Employee, Integer> {
    Employee findByEmpContact(Long empContact);

    List<Employee> findByEmpDeptId(int empDeptId);
}
