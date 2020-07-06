package employee.manage.employeemanagement.domain;

public class Login {
    private Long userId;
    private Long userPassword;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(Long userPassword) {
        this.userPassword = userPassword;
    }
}
