package net.abcbook.learn.thymeleaf.controller;

import net.abcbook.learn.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author summer
 * @date 2018/5/29 下午3:35
 */
@Controller
@RequestMapping("/expression")
public class ExpressionController {

    @GetMapping
    public String expression(ModelMap modelMap){
        String blog = "<h2>这是博客标题</h2>";
        User user = new User("summer",18,1,"http://blog.abcbook.net",blog);
        user.setAge(null);
        String testerName = "tester";
        modelMap.addAttribute("user", user);
        modelMap.addAttribute("testerName", testerName);

        return "/expression";
    }
}
