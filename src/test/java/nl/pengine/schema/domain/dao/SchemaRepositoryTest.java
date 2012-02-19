package nl.pengine.schema.domain.dao;

import nl.pengine.schema.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/person-repository-test.xml"})
public class SchemaRepositoryTest {

    @Autowired
    @Qualifier("userRedisTemplate")
    private RedisTemplate userRedisTemplate;

    @Autowired
    @Qualifier("applicationKeyRedisTemplate")
    private RedisTemplate<String,ApplicationKey> applicationKeyRedisTemplate;

    @Test
    public void should_create_person_repo() {
        assertThat(this.userRedisTemplate, is(notNullValue()));
        assertThat(this.applicationKeyRedisTemplate, is(notNullValue()));
    }

    @Test
    public void should_persist_and_retrieve_user() {
        User user = new User();
        UserName userName = new UserName();
        userName.setFirstname("testfirstname");
        userName.setSurname("testsuername");
        userName.setInitials("testinitials");
        userName.setMothersName("testmothersname");
        userName.setNickname("testnickname");
        userName.setPrefix("testprefix");
        user.setUserName(userName);
        user.setPassword(new Password("testpassword"));

        Object key = new String("persons");
        Long longValue = this.userRedisTemplate.opsForList().leftPush(key, user);
        System.out.println("longValue for the key: " + longValue);
        assertThat(longValue, is(notNullValue()));
        User userFromRedis = (User) this.userRedisTemplate.opsForList().leftPop(key);
        assertThat(userFromRedis.getUserName().getFirstname(), is(userName.getFirstname()));
        assertThat(userFromRedis.getUserName().getInitials(), is(userName.getInitials()));
        assertThat(userFromRedis.getUserName().getMothersName(), is(userName.getMothersName()));
        assertThat(userFromRedis.getUserName().getNickname(), is(userName.getNickname()));
        assertThat(userFromRedis.getUserName().getPrefix(), is(userName.getPrefix()));
        assertThat(userFromRedis.getUserName().getSurname(), is(userName.getSurname()));
        assertThat(userFromRedis.getPassword().getPassword(), is("testpassword"));
    }

    @Test
    public void should_persist_and_retrieve_application_key() {
        ApplicationKey applicationKey = new ApplicationKey("100", "200", Application.GoogleApps);

        String key = new String("applicationKeyGoogleApps");
        for (int i = 0; i < 1000; i++) {
            Long index = this.applicationKeyRedisTemplate.opsForList().leftPush(key, applicationKey);
        }
        ApplicationKey applicationKeyRedis = (ApplicationKey) this.applicationKeyRedisTemplate.opsForList()
                                                                                              .leftPop(key);
        System.out.println("length of the list: " + this.applicationKeyRedisTemplate.opsForList().size(key));

        assertThat(applicationKeyRedis.getUserId(), is("100"));
    }
}
