package nl.pengine.schema.domain.dao;

import nl.pengine.schema.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findById(String id);
}
