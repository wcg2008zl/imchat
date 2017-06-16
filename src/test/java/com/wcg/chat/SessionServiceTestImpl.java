package com.wcg.chat;

import com.wcg.chat.entity.User;
import com.wcg.chat.session.Session;
import com.wcg.chat.session.SessionService;

/**
 * Created by a on 2017-06-16.
 */
public class SessionServiceTestImpl implements SessionService {

    @Override
    public boolean registerSession(User user) {
        return false;
    }

    @Override
    public boolean unregisterSession(User user) {
        return false;
    }

    @Override
    public boolean activeSession(User user) {
        return false;
    }

    @Override
    public Session getUserSessionOnline(User user) {
        return null;
    }
}
