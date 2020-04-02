package com.yygq.watch.mapper;

import com.yygq.watch.bean.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {

        @Select("select * from user where userName=#{userName}")
        public User getDeptById(String userName);

        @Delete("delete from user where id=#{id}")
        public int deleteDeptById(Integer id);

        @Options(useGeneratedKeys = true,keyProperty = "id")
        @Insert("insert into user(userName) values(#{userName})")
        public int insertDept(User user);

        @Update("update user set password=#{password} where id=#{id}")
        public int updateDept(User user);
}
