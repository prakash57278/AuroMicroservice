package departmentstatistics.department.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Department {
    @Id
    private int deptId;
    private double deptHighSalary;
    private double deptLowSalary;
    private double deptAvgSalary;
    private double deptMaleRation;
    private double deptFemaleRatio;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public double getDeptHighSalary() {
        return deptHighSalary;
    }

    public void setDeptHighSalary(double deptHighSalary) {
        this.deptHighSalary = deptHighSalary;
    }

    public double getDeptLowSalary() {
        return deptLowSalary;
    }

    public void setDeptLowSalary(double deptLowSalary) {
        this.deptLowSalary = deptLowSalary;
    }

    public double getDeptAvgSalary() {
        return deptAvgSalary;
    }

    public void setDeptAvgSalary(double deptAvgSalary) {
        this.deptAvgSalary = deptAvgSalary;
    }

    public double getDeptMaleRation() {
        return deptMaleRation;
    }

    public void setDeptMaleRation(double deptMaleRation) {
        this.deptMaleRation = deptMaleRation;
    }

    public double getDeptFemaleRatio() {
        return deptFemaleRatio;
    }

    public void setDeptFemaleRatio(double deptFemaleRatio) {
        this.deptFemaleRatio = deptFemaleRatio;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptHighSalary=" + deptHighSalary +
                ", deptLowSalary=" + deptLowSalary +
                ", deptAvgSalary=" + deptAvgSalary +
                ", deptMaleRation=" + deptMaleRation +
                ", deptFemaleRatio=" + deptFemaleRatio +
                '}';
    }
}
