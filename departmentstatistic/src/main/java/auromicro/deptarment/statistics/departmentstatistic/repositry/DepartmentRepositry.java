package auromicro.deptarment.statistics.departmentstatistic.repositry;

import auromicro.deptarment.statistics.departmentstatistic.domain.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepositry extends MongoRepository<Department, Integer> {
}
