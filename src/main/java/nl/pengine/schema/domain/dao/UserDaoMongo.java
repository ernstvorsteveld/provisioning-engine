package nl.pengine.schema.domain.dao;

import nl.pengine.schema.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 */
public class UserDaoMongo implements UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    private final UserRepository userRepository;

    public UserDaoMongo(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        logger.debug("About to save user: {}", user);
        return this.userRepository.save(user);
    }

    public void delete(User user) {
        logger.debug("About to delete user: {}", user);
        this.userRepository.delete(user);
    }

    public void delete(String id) {
        logger.debug("About to delete user by id: {}", id);
        this.userRepository.delete(id);
    }

    public User findById(String id) {
        logger.debug("About to find user by id: {}", id);
        return this.userRepository.findById(id);
    }
}
