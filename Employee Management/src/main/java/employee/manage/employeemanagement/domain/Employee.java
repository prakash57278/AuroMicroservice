package employee.manage.employeemanagement.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


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

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empContact=" + empContact +
                ", empEmail='" + empEmail + '\'' +
                ", empPhoto='" + empPhoto + '\'' +
                ", empDeptId=" + empDeptId +
                ", empSex='" + empSex + '\'' +
                ", empSalary=" + empSalary +
                ", Skillset=" + Skillset +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getEmpContact() {
        return empContact;
    }

    public void setEmpContact(Long empContact) {
        this.empContact = empContact;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPhoto() {
        return empPhoto;
    }

    public void setEmpPhoto(String empPhoto) {
        this.empPhoto = empPhoto;
    }

    public int getEmpDeptId() {
        return empDeptId;
    }

    public void setEmpDeptId(int empDeptId) {
        this.empDeptId = empDeptId;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public Long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Long empSalary) {
        this.empSalary = empSalary;
    }

    public List<employee.manage.employeemanagement.domain.Skillset> getSkillset() {
        return Skillset;
    }

    public void setSkillset(List<employee.manage.employeemanagement.domain.Skillset> skillset) {
        Skillset = skillset;
    }


}
