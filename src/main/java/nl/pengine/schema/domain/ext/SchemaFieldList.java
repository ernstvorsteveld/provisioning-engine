package nl.pengine.schema.domain.ext;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 */
@Document(collection = "SchemaFieldList")
public class SchemaFieldList {

    private Set<SchemaField> schemaFields;


}
