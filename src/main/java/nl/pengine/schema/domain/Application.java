package nl.pengine.schema.domain;

import com.google.common.collect.Sets;

import java.util.Collection;
import java.util.Set;

/**
 */
public class Application {

    private final String name;
    private final Set<Application> applications;

    public Application(String name) {
        this(name, null);
    }

    public Application(String name, Collection<Application> applications) {
        this.name = name;
        if (applications != null) {
            this.applications = Sets.newHashSet();
            this.applications.addAll(applications);
        } else {
            this.applications = null;
        }
    }

    public String getName() {
        return name;
    }

    public Set<Application> getApplications() {
        return applications;
    }

    public void addApplication(Application application) {
        if (application == null) {
            return;
        }
        this.applications.add(application);
    }

    public void addApplication(Collection<Application> applications) {
        if (applications == null) {
            return;
        }
        this.applications.addAll(applications);
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", applications=" + applications +
                '}';
    }
}
