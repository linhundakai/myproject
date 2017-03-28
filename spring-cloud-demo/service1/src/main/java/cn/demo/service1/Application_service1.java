package cn.demo.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/11/21 23:01
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "cn.demo.service1")
@EnableFeignClients
@EnableEurekaClient
public class Application_service1 {
    public static void main(String[] args) {
        SpringApplication.run(Application_service1.class, args);
    }
}
