package com.kevin.mapper;

import com.kevin.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from t_user where username = #{name}")
    public User findByName(String name);

    @Select("select * from t_user where id = #{id}")
    public User findById(Integer id);

}
