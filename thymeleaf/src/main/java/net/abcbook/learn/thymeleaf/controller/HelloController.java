package net.abcbook.learn.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author summer
 * @date 2018/5/28 下午1:38
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    public String helloWorld(){
        return "hello_world";
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name, ModelMap modelMap){
        modelMap.addAttribute("name", name);
        return "hello";
    }

}
