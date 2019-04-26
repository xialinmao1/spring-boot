package cn.kuang.demo.controller;
import cn.kuang.demo.pojo.User;
import cn.kuang.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 使用RestController注解, 可以不用ResponseBody注解来表示返回视图
 * Created by 框 on 2018/4/19.
 */


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("show")
    public List<User> getUser(int age){
        return userService.getUser(age);
    }

}
