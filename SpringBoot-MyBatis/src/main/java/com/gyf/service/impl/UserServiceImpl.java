package com.gyf.service.impl;

import com.gyf.dao.UserDao;
import com.gyf.domain.User;
import com.gyf.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService  {
    @Autowired
    private UserDao userDao;
    @Override
    public User list(Integer id) {
        log.info("输入的id为===>{}",id);
        User user = userDao.list(id);
        log.info("输出的结果为===>{}",user);
        return user;
    }

    @Override
    public List<User> listall() {
        return userDao.listall();
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void remove(Integer id) {
        try {
            userDao.remove(id);
        }catch (Exception e){
            log.error("删除出错，错误为===> {}",e.toString());
            throw new RuntimeException();
        }
    }

    @Override
    public void updata(User user) {
        userDao.updata(user);
    }
}
