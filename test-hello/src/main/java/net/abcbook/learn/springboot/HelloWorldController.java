package net.abcbook.learn.springboot;

import org.springframework.web.bind.annotation.*;

/**
 * @author summer
 * @date 2018/4/3 下午4:28
 * HelloWorld 程序的 Controller
 */
/*
 * @RestController相当于
 * @Controler+@ResponseBody
 * @Controller表示在Spirng中注入一个bean,这个bean的类型是一个控制器
 * @ResponseBody表示返回的数据类型是JSON
 */
@RestController
/*
 * @RequestMapping用来定义请求的路径,
 * 定义在类上,则当前类下所有的映射路径均有这个前缀
 * 括号内传递的值是所映射的路径
 */
@RequestMapping("/demo")
public class HelloWorldController {
    /**
     * @author summer
     * @date 2018/4/3 下午4:31
     * @return java.lang.String
     * @description HelloWorld 接口
     */
    /*
     * @GetMapping 相当于 @RequestMapping(method = RequestMethod.GET)
     * 同理@PostMapping 相当于 @RequestMapping(method = RequestMethod.POST)
     * 另外还有 @PutMapping @DeleteMapping
     */
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
