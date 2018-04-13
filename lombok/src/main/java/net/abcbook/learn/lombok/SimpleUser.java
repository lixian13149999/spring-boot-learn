package net.abcbook.learn.lombok;

import lombok.*;

/**
 * @author summer
 * @date 2018/4/12 下午6:35
 */
/*
 * getter 方法
 * @Getter
 *
 * setter 方法
 * @Setter
 *
 * toString 方法
 * @ToString
 *
 * equalsAndHashCode
 * @EqualsAndHashCode
 *
 * @RequiredArgsConstructor
 * 生成一个包含必填参数的构造函数
 * 要与@NonNull 搭配使用，该注解修饰的属性就是必填参数
 *
 * @Data 是对上面所有的方法的整合
 */
@Data
/*
 * 空参构造
 */
@NoArgsConstructor
/*
 * 全参构造
 */
@AllArgsConstructor()
public class SimpleUser {

    private String username;
    private String password;
    private Integer age;
}
