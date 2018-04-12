package net.abcbook.learn.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author summer
 * @date 2018/4/12 下午3:34
 * 通过 value 的方式获取配置文件内容的测试方法
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorValueTest {

    @Autowired
    private AuthorValue authorValue;

    @Test
    public void getUserMessage(){
        Integer age = 10;
        Assert.assertEquals(authorValue.getName(), "summer");
        Assert.assertEquals(authorValue.getAge(), age);
    }
}
