package net.abcbook.learn.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author summer
 * @date 2018/4/12 下午3:32
 * 配置文件对应的实体
 */
@Component
public class AuthorValue {
    /**
     * 用户名
     */
    /*
     * 通过 value 注解获取 properties 文件中的内容
     * ${属性的全称}
     */
    @Value("${author.name}")
    private String name;
    /*
     * 若配置文件中没有配置相应的属性, 而在类中又通过 @Value的形式获取, 系统启动时会报错
     * 所以, 我们可以通过设定默认值的形式避免这样的问题
     */
    @Value("${author.age:10}")
    private Integer age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
