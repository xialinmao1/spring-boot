package cn.kuang.demo.dao;

import cn.kuang.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 使用注解开发dao层,不用配置mapper.xml
 * Created by 框 on 2018/4/19.
 */

@Mapper
public interface UserMapper {

    /**
     * 根据年龄查询
     * @param age
     * @return
     */
    @Select("SELECT * FROM USER WHERE AGE=#{age}")
    public List<User> getUser(int age);

}
