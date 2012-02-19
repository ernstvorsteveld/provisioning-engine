package nl.pengine.schema.domain.ext;

/**
 */
public class StringValue extends AbstractPersonDetail {

    private final String value;

    public StringValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
