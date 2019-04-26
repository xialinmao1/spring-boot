package cn.kuang.demo.service;

import cn.kuang.demo.dao.UserMapper;
import cn.kuang.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicelmpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUser(int age) {
        return userMapper.getUser(age);
    }
}
