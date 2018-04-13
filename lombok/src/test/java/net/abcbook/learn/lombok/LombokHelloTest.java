package net.abcbook.learn.lombok;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author summer
 * @date 2018/4/12 下午6:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LombokHelloTest {

    @Test
    public void lombokHello(){
        SimpleUser simpleUser = new SimpleUser();
        simpleUser.setUsername("summer");

        Assert.assertEquals(simpleUser.getUsername(), "summer");

        log.info("username: " + simpleUser.getUsername());
    }

    @Test
    public void constructorTest(){
        SimpleUser simpleUser = new SimpleUser("username", "password", 18);

        Assert.assertEquals("username", simpleUser.getUsername());

        log.info("user: " + simpleUser.toString());
    }
}
