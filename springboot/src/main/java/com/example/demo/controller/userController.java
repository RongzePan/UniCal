//package com.example.demo.controller;
//
//
//import com.example.demo.common.Result;
//import com.example.demo.mapper.UserMapper;
//import jakarta.annotation.Resource;
//import org.springframework.web.bind.annotation.*;
//
//@RestController//定义返回JSON的controller
//@RequestMapping("/User")//定义路由
//public class userController {
//
//    @Resource
//    UserMapper userMapper;
//    @PostMapping//定义post接口
//    public Result<?> save(@RequestBody User User/*把前台JSON转换为java对象*/) {
//
//
//        userMapper.insert(User);
//
//        return Result.success();
//
//
//
//    }
//
//}

//前后台数据交互的接口
package com.example.demo.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.common.Result;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class userController {

    @Resource
    UserMapper userMapper;

    @PostMapping
    public Result<?> save(@RequestBody User user) {
        if (user.getPassword() == null) {
            user.setPassword("12345678");
        }
        userMapper.insert(user);
        return Result.success();
    }



}
