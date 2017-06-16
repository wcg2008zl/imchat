package com.wcg.chat.session;

import com.wcg.chat.chat.Broker;
import com.wcg.chat.entity.ChatSnapshot;
import com.wcg.chat.entity.User;

/**
 * Created by a on 2017-06-16.
 */
public class Session {

    private User user;

    private Broker broker;

    private  long loginTime;

    private long lastActiveTime;




    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }


    public void sendAndFlushMsg(ChatSnapshot chatSnapshot) {


    }
}
