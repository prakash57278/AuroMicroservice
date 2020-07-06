package departmentstatistics.department.repositry;


import departmentstatistics.department.domain.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepositry extends  MongoRepository<Department, Integer> {
}
