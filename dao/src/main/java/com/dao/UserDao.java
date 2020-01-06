package com.dao;

import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private User user;

    public User getUser() {
        return user;
    }

    public String showDao(){
        return user.showEntity()+"    我是Dao！";
    }
}
