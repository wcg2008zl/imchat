package com.wcg.chat.entity;

/**
 * Created by a on 2017-06-09.
 */
public class User {

    private int userId;

    private String userName;

    private String nickName;



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override

    public int hashCode() {

        return userName.hashCode();
    }


    @Override


    public boolean equals(Object user) {


        if(this == user) {

            return true;
        }

        if(user == null) {

            return false;
        }

        if(!(user instanceof User)) {

            return false;
        }


        User u = (User) user;

        return this.userId == u.userId;
    }

}
