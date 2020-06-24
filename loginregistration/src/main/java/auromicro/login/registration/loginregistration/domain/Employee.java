package auromicro.login.registration.loginregistration.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;
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

    private List<Skillset> Skillset;

    public Employee() {
    }
}
