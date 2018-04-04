package net.abcbook.learn.springboot;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author summer
 * @date 2018/4/4 下午5:21
 * 用户的 Service 服务
 */
@Service
public class UserService {

    /**
     * @author summer
     * @date 2018/4/4 下午5:35
     * @return java.lang.String
     * @description SpringBoot Junit 测试的 HelloWorld
     */
    public String hello(){
        System.out.println("Hello World");
        return "success";
    }

    /**
     * @author summer
     * @date 2018/4/4 下午5:22
     * @param world 所讲的词
     * @return void
     * @description 用户说话的方法
     */
    public Boolean userSay(String world){
        // 对参数判断, 如果参数为空, 则返回false
        if(StringUtils.isEmpty(world)){
            return false;
        }

        // 当传入值是 hello 的时候, 返回 null
        if("hello".equals(world)){
            return null;
        }

        // 执行打印
        System.out.println("user say:" + world);
        // 返回 true
        return true;
    }
}
