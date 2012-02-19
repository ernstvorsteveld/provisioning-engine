package nl.pengine.schema.domain.ext;

import nl.pengine.schema.domain.Password;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 */
@Document(collection="SchemaObject")
public class SchemaObject {

    @Id
    private String id;

    private Password password;

    private SchemaObjectId schemaObjectId;

    private Set<Resource> resources;

    private Set<Role> roles;


}
