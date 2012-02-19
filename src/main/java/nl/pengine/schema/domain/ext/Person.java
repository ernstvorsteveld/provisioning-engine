package nl.pengine.schema.domain.ext;

import com.google.common.collect.Maps;
import org.codehaus.jackson.annotate.JsonAutoDetect;

import java.util.Map;

/**
 */
@JsonAutoDetect
public class Person {

    private String firstname;

    private String lastname;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
