package nl.pengine.schema.domain;

import com.google.common.collect.Sets;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.Set;

/**
 */
@Document(collection = "system")
public class Roles {

    private String TYPE = "Roles";

    @Id
    private String id;

    private final Set<Role> roles = Sets.newHashSet();

    public void addRole(Role role) {
        if (role == null) {
            return;
        }
        this.roles.add(role);
    }

    public void addRole(Collection<Role> roles) {
        if (roles == null) {
            return;
        }
        this.roles.addAll(roles);
    }

    public String getId() {
        return id;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "TYPE='" + TYPE + '\'' +
                ", id='" + id + '\'' +
                ", roles=" + roles +
                '}';
    }
}
