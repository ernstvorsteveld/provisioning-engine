package nl.pengine.schema.domain;

import com.google.common.collect.Sets;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.Set;

/**
 */
@Document(collection = "system")
public class Resources {

    private String TYPE = "Resources";

    @Id
    private String id;

    private Set<Resource> resources = Sets.newHashSet();

    public void addResource(Resource resource) {
        if (resource == null) {
            return;
        }
        this.resources.add(resource);
    }

    public void addResource(Collection<Resource> resources) {
        if (resources == null) {
            return;
        }
        this.resources.addAll(resources);
    }

    public String getId() {
        return id;
    }

    public Set<Resource> getResources() {
        return resources;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "TYPE='" + TYPE + '\'' +
                ", id='" + id + '\'' +
                ", resources=" + resources +
                '}';
    }
}
