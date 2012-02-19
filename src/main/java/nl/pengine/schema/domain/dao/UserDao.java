package nl.pengine.schema.domain.dao;

import nl.pengine.schema.domain.User;

/**
 */
public interface UserDao {

    User save(User user);

    void delete(User user);
    void delete(String id);

    User findById(String id);

}
