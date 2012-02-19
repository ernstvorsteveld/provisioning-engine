package nl.pengine.schema.domain.ext;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 */
@Document(collection = "SchemaDefinition")
public class SchemaDefinition {

    private Set<SchemaField> schemaFields;


}
