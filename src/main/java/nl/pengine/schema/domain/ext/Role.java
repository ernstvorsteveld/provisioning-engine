package nl.pengine.schema.domain.ext;

import org.springframework.data.annotation.Id;

/**
 */
public class Role {

    @Id
    private String id;

    private String name;
    
}
