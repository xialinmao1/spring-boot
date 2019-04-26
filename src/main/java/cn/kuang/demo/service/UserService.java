package cn.kuang.demo.service;

import cn.kuang.demo.pojo.User;

import java.util.List;

public interface UserService {

    public List<User> getUser(int age);

}