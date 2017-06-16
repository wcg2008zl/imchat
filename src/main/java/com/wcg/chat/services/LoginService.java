package com.wcg.chat.services;

import com.wcg.chat.entity.User;

/**
 * Created by a on 2017-06-16.
 */
public interface LoginService {


    public User checkLogin(String userName,String password);

    public boolean loginOut(User user);
}
