package com.ssm.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class ZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello1";
    }

}
