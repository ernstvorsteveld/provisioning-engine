package nl.pengine.schema.domain.dao;

import nl.pengine.schema.domain.ApplicationKey;
import nl.pengine.schema.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JacksonJsonRedisSerializer;

/**
 */
@Configuration
public class SchemaRepositoryConfiguration {

    @Value("${redis.hostname}")
    private String hostname;

    @Value("${redis.timeout}")
    private int timeout;

    @Value("${redis.password}")
    private String password;

    @Value("${redis.port}")
    private int port;

    @Bean(name = "jedisConnectionFactory")
    public JedisConnectionFactory jedisConnectionFactory() {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName(this.hostname);
        jedisConnectionFactory.setTimeout(this.timeout);
        jedisConnectionFactory.setPassword(this.password);
        jedisConnectionFactory.setPort(this.port);
        return jedisConnectionFactory;
    }

    @Bean(name = "userRedisTemplate")
    public RedisTemplate userRedisTemplate() {
        return createFor(User.class);
    }

    @Bean(name = "applicationKeyRedisTemplate")
    public RedisTemplate applicationKeyRedisTemplate() {
        return createFor(ApplicationKey.class);
    }

    private RedisTemplate createFor(Class clazz) {
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        JacksonJsonRedisSerializer userSerializer = new JacksonJsonRedisSerializer(clazz);
        redisTemplate.setValueSerializer(userSerializer);
        return redisTemplate;
    }
}
