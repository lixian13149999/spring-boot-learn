package net.abcbook.learn.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author summer
 * @date 2018/4/13 上午10:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class User extends BaseModel {

    private String username;
    private String password;
    private Integer age;
}
