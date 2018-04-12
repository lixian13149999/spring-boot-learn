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
public class RandomValueTest {

    @Autowired
    private RandomValue randomValue;

    @Test
    public void getUserMessage(){
        Assert.assertNotNull(randomValue.getValue());
        Assert.assertNotNull(randomValue.getNumber());
        Assert.assertNotNull(randomValue.getBignumber());
        Assert.assertNotNull(randomValue.getNumber1());
        Assert.assertNotNull(randomValue.getNumber2());

        System.out.println(randomValue.getValue());
    }
}
