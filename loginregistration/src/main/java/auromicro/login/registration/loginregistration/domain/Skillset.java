package auromicro.login.registration.loginregistration.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Setter
@Getter
@Document
public class Skillset {

    @Id
    private int skillId;
    private String skillName;
}
