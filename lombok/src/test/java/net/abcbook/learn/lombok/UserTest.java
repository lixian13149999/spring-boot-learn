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
 * 含有继承的对象, 测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserTest {

    /**
     * @author summer
     * @date 2018/4/13 上午11:02
     * @return void
     * @description 获取全参构造的测试方法
     */
    @Test
    public void allArgsConstructorTest(){
        /*
         * 在上一个例子中已经加入了一个全参构造的方法
         * 但是继承时, 能不能加上父类的参数一起生成构造方法呢? 答案是不行
         * 但是在 @ToString 和 @EquesAndHashCode 使用的时候是可以连同父类的属性一起生成的
         */
        User user = new User("username", "password", 18);
        user.setId(123L);


        Long assertId = 123L;
        Assert.assertEquals(assertId, user.getId());
    }

    @Test
    public void allArgsToString(){
        User user = new User("username", "password", 18);
        user.setId(123L);


        Long assertId = 123L;
        Assert.assertEquals(assertId, user.getId());

        log.info("AllArgsUser contain Super: " + user.toString());
    }
}