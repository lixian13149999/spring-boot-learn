package net.abcbook.learn.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author summer
 * @date 2018/4/4 下午5:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    /**
     * 注入 service
     */
    @Autowired
    private UserService userService;

    /**
     * @author summer
     * @date 2018/4/4 下午5:37
     * @return void
     * @description SpringBoot + Junit 测试的 HelloWorld
     */
    @Test
    public void hello() throws Exception {
        String result = userService.hello();
    }

    /**
     * @author summer
     * @date 2018/4/4 下午5:26
     * @return void
     * @description 用户说话的测试方法
     */
    @Test
    public void userSay() throws Exception {
        Boolean result = userService.userSay("你好");

        // 断言返回值不为空
        Assert.assertNotNull(result);
        // 断言返回值不为 false
        Assert.assertNotEquals(result, false);
        // 断言返回值是 true
        Assert.assertEquals(result, true);
    }

}