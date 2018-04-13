package net.abcbook.learn.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author summer
 * @date 2018/4/13 上午9:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseModel {
    private Long id;
}
