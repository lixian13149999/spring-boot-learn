package net.abcbook.learn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author summer
 * @date 2018/4/3 下午4:22
 * @description HelloWorld 的启动类
 */
/*
 * 注解表明这是 Spring 的主配置文件
 */
@SpringBootApplication
public class TestHelloApplication {
	/**
	 * @author summer
	 * @date 2018/4/3 下午4:23
	 * @param args 启动参数
	 * @return void
	 * @description 启动入口
	 */
	public static void main(String[] args) {
		SpringApplication.run(TestHelloApplication.class, args);
	}
}
