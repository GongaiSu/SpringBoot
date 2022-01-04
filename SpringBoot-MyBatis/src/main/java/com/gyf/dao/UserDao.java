package com.gyf.dao;

import com.gyf.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

     User list(Integer id);

     List<User> listall();

     void add(User user);

     void remove(Integer id);

     void updata(User user);

}
