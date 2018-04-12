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
public class AuthorObjectTest {

    @Autowired
    private AuthorObject authorObject;

    @Test
    public void getUserMessage(){
        Integer age = 18;
        Assert.assertEquals(authorObject.getName(), "summer");
        Assert.assertEquals(authorObject.getAge(), age);
        Assert.assertFalse(authorObject.getWife().isEmpty());
        Assert.assertFalse(authorObject.getBooks().isEmpty());
        Assert.assertNotNull(authorObject.getIntroduce());

        System.out.println("user wife name: " + authorObject.getWife().get("name"));
        System.out.println("user wife name: " + authorObject.getWife().get("age"));

        System.out.println("first boot: " + authorObject.getBooks().get(0));

        System.out.println(authorObject.getIntroduce());
    }
}
