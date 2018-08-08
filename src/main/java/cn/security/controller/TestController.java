package cn.security.controller;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by viruser on 2018/8/8.
 */

@RestController
@EnableWebSecurity
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
