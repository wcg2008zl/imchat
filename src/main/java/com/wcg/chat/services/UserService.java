package com.wcg.chat.services;

import com.wcg.chat.entity.Group;
import com.wcg.chat.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created by a on 2017-06-14.
 */
public interface UserService extends EntityService<User>{



     public User findUserInfoByUserId(int userId);



}
