package auromicro.deptarment.statistics.departmentstatistic.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Setter
@Getter
@Document
public class Department {
    @Id
    private int deptId;
    private double deptHighSalary;
    private double deptLowSalary;
    private double deptAvgSalary;
    private double deptMaleRation;
    private double deptFemaleRatio;


}
