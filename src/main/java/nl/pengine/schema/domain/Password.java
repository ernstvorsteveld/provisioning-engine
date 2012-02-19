package nl.pengine.schema.domain;

/**
 */
public class Password {

    private final String password;

    private Password() {
        this("");
    }

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
