package nl.pengine.schema.domain;

/**
 */
public class Resource {

    private final Application applicationName;

    public Resource(Application applicationName) {
        this.applicationName = applicationName;
    }

    public Application getApplicationName() {
        return applicationName;
    }
}
