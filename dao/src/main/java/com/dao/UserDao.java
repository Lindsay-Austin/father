package com.dao;

import com.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private final static Logger log = LoggerFactory.getLogger(UserDao.class);

    @Autowired
    private User user;

    public User getUser() {
        return user;
    }

    public String showDao(){
        log.trace("trace级别的日志");
        log.debug("debug级别日志");
        log.info("info级别日志");
        log.warn("warn级别的日志");
        log.error("error级别日志");
        String s = null;
        System.out.println("s :     "+s.length());
        return user.showEntity()+"    我是Dao！";
    }
}
