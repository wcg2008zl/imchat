package com.wcg.chat.session;

import com.wcg.chat.entity.User;

/**
 * Created by a on 2017-06-16.
 */
public interface SessionService {

        public Session registerSession(User user);

        public boolean unregisterSession(User user);

        public boolean activeSession(User user);


        public Session getUserSessionOnline(User user);

}
