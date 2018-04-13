package net.abcbook.learn.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author summer
 * @date 2018/4/4 下午5:02
 * HelloWorld 的测试方法
 */
/*
 * 指定使用的单元测试执行类
 */
@RunWith(SpringRunner.class)
/*
 * 类似springboot程序的测试引导入口
 */
@SpringBootTest
/*
 * 引入模拟器
 * 使 MockMvc 可以自动注入
 */
@AutoConfigureMockMvc
public class HelloWorldControllerTest {

    /**
     * Mock MVC提供了一种强力的方式来测试MVC controllers，而不用启动一个完整的HTTP server
     * 模拟一个 HTTP Server
     */
    @Autowired
    private MockMvc mockMvc;

    /**
     * @author summer
     * @date 2018/4/4 下午5:15
     * @return void
     * @description 使用模拟器测试 `/demo/hello` 接口是否正确
     */
    @Test
    public void helloWorld() throws Exception {
        //设定请求路径及请求方式并执行请求
        MvcResult mvcResult = mockMvc.perform(
                MockMvcRequestBuilders.get("/demo/hello")
                        // 请求时传入的参数
                        .param("name", "value")
                )
                // 判断返回的状态是否ok
                .andExpect(MockMvcResultMatchers.status().isOk())
                // 判断内容是否和预计内容一致
                .andExpect(MockMvcResultMatchers.content().string("Hello World"))
                // 发送请求后需要获取放回时调用
                .andReturn();
    }
}