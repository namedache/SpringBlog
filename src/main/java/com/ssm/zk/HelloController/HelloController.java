package com.ssm.zk.HelloController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019-03-26 17:20
 * @Author zhoukun
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

    @PostMapping("/hhh")
    public String hhh(){
        return "jjj";
    }

}
