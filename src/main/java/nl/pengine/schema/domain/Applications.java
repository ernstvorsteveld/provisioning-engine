package nl.pengine.schema.domain;

import com.google.common.collect.Sets;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.Set;

/**
 */
@Document(collection = "system")
public class Applications {

    private String TYPE = "Applications";

    @Id
    private String id;

    private Set<Application> applications = Sets.newHashSet();

    public void addApplication(Application application) {
        this.applications.add(application);
    }

    public void addApplication(Collection<Application> applications) {
        this.applications.addAll(applications);
    }

    public String getId() {
        return id;
    }

    public Set<Application> getApplications() {
        return applications;
    }

    @Override
    public String toString() {
        return "Applications{" +
                "TYPE='" + TYPE + '\'' +
                ", id='" + id + '\'' +
                ", applications=" + applications +
                '}';
    }
}

