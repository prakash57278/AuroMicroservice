package auromicro.login.registration.loginregistration.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
public class EmployeeByDept {
    public List<Employee> employeeList;
}
