package net.abcbook.learn.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author summer
 * @date 2018/5/29 下午3:36
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String name;
    private Integer age;
    private Integer sex;
    private String blogUrl;
    private String blog;
}
