package nl.pengine.schema.domain;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.NotNull;

/**
 */
@JsonAutoDetect
public class User {

    @Id
    private String id;

    @NotNull(message = "User.UserName.NotNull")
    private UserName userName;

    private Password password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName=" + userName +
                ", password=" + password +
                '}';
    }
}
