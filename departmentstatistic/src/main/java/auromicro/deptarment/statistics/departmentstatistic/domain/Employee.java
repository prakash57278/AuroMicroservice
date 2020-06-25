package auromicro.deptarment.statistics.departmentstatistic.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@ToString
@Setter
@Getter
@Document
public class Employee {
    @Id
    private int empId;
    private String empName;
    private Long empContact;
    private String empEmail;
    private String empPhoto;
    private int empDeptId;
    private String empSex;
    private Long empSalary;
    private List<Skillset> Skillset;

    public Employee() {
    }
}
