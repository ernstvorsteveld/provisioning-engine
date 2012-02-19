package nl.pengine.schema.domain;

/**
 */
public class ApplicationKey {

    private final String userId;
    private final String remoteId;
    private final Application applicationName;

    private ApplicationKey() {
        this("", "", null);
    }

    public ApplicationKey(String userId, String remoteId, Application applicationName) {
        this.userId = userId;
        this.remoteId = remoteId;
        this.applicationName = applicationName;
    }

    public String getUserId() {
        return userId;
    }

    public String getRemoteId() {
        return remoteId;
    }

    public Application getApplicationName() {
        return applicationName;
    }
}
