package com.huawei.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.huawei.demo.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is Description
 *
 * @author 王明飞
 * @date 2018/09/10
 */

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response)
    {


        return "Hello World   "+request.getAttribute("wang");
    }


    @RequestMapping("/getUser")
    public User getUser()
    {
        List<String> list = new ArrayList<>();
        list.add("dsgasg");
        list.add("ddddd");
        list.add("ggggg");
        User user = new User();
        user.setPassword("123456");
        user.setUsername("wangmingfei");
        user.setList(list);
        return user;
    }
}
