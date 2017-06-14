package com.wcg.chat.listeners;

import com.wcg.chat.entity.User;

/**
 * Created by a on 2017-06-09.
 */
public interface UserListener extends EntityModifyListener<User> {

    public void onUserOnline(User user);

    public void onUserUnderline(User user);

}
