package auromicro.login.registration.loginregistration.repositry;

import auromicro.login.registration.loginregistration.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepositry extends MongoRepository<Employee, Integer> {
    Employee findByEmpContact(Long empContact);
}
