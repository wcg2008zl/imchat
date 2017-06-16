package com.wcg.chat.session;


import com.wcg.chat.entity.ChatView;
import com.wcg.chat.entity.User;

/**
 * Created by a on 2017-06-09.
 */
public class SessionContext {

    private User currentUser;

    /**
     *
     * 本次会话token
     */
    private String token;

    /**
     * 会话开始时间;
     * */

    private long loginTime;

    /**
     *
     * 含UI义务逻辑，记录用户最后的聊天界面布局 ，同时据此
     *
     * */


    private ChatView chatView;


    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(long loginTime) {
        this.loginTime = loginTime;
    }

    public ChatView getChatView() {
        return chatView;
    }

    public void setChatView(ChatView chatView) {
        this.chatView = chatView;
    }

    @Override

    public int hashCode() {

        return currentUser.hashCode();
    }


    @Override
    public boolean equals(Object sessionContext) {

        if(this == sessionContext) {

            return true;
        }

        if(sessionContext == null) {

            return false;
        }

        if(!(sessionContext instanceof  SessionContext)) {

            return false;
        }

        return this.currentUser.equals(((SessionContext) sessionContext).currentUser);

    }
}