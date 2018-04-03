package net.abcbook.learn.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author summer
 * @date 2018/4/3 下午4:28
 * HelloWorld 程序的 Controller
 */
@RestController
public class HelloWorldController {


    /**
     * @author summer
     * @date 2018/4/3 下午4:31
     * @return java.lang.String
     * @description HelloWorld 接口
     */
    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello World";
    }
}
