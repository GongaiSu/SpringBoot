package com.gyf.dao;

import com.gyf.domain.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

     User list(Integer id);

     List<User> listall();

     void add(User user);

     void remove(Integer id);

     void updata(User user);

     Map<String,Object> getIdForUser(Integer id);

     @MapKey("id")
     Map<Integer,User> getNameForUser(String name);
}
