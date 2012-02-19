package nl.pengine.schema.domain;

import com.google.common.collect.Sets;

import java.util.Collection;
import java.util.Set;

/**
 */
public class Role {

    private final String name;
    private final Set<Resource> resources = Sets.newHashSet();

    public Role(String name) {
        this(name, null);
    }

    public Role(String name, Collection<Resource> resources) {
        this.name = name;
        if (resources != null) {
            this.resources.addAll(resources);
        }
    }

    public String getName() {
        return name;
    }

    public void addRole(Resource resource) {
        if (resource == null) {
            return;
        }
        this.resources.add(resource);
    }

    public void addRole(Collection<Resource> resources) {
        if (resources == null) {
            return;
        }
        this.resources.addAll(resources);
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                '}';
    }
}
