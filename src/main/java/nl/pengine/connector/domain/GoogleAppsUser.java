package nl.pengine.connector.domain;

import nl.pengine.schema.domain.EmailAddres;
import nl.pengine.schema.domain.Password;
import org.identityconnectors.framework.common.objects.AttributeBuilder;

import java.util.List;

/**
 */
public class GoogleAppsUser {

    private String id;

    private String givenName;
    private String familyName;
    private Password password;
    private EmailAddres emailAddres;
    private List<String> nickNames;
    private List<String> organizationUnit;


}
