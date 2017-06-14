package com.wcg.chat;

import java.util.List;
import java.util.Map;

import com.wcg.chat.entity.ChatSnapshot;
import com.wcg.chat.entity.Group;
import com.wcg.chat.entity.User;
import com.wcg.chat.session.SessionContext;

/**
 * Created by a on 2017-06-14.
 */
public class Mappings {

    private Map<Integer,Group> groupMapping;

    private Map<Integer,User> userMapping;

    /**
     * 映射groupId到用户列表
     */
    private Map<Integer,List<User>> group2UserMapping;

    /**
     *
     * 映射用户到组列表
     *
     */
    private Map<Integer,List<Group>> user2GroupMapping;





    public Map<Integer, Group> getGroupMapping() {
        return groupMapping;
    }

    public void setGroupMapping(Map<Integer, Group> groupMapping) {
        this.groupMapping = groupMapping;
    }

    public Map<Integer, User> getUserMapping() {
        return userMapping;
    }

    public void setUserMapping(Map<Integer, User> userMapping) {
        this.userMapping = userMapping;
    }

    public Map<Integer, List<User>> getGroup2UserMapping() {
        return group2UserMapping;
    }

    public void setGroup2UserMapping(
        Map<Integer, List<User>> group2UserMapping) {
        this.group2UserMapping = group2UserMapping;
    }

    public Map<Integer, List<Group>> getUser2GroupMapping() {
        return user2GroupMapping;
    }

    public void setUser2GroupMapping(
        Map<Integer, List<Group>> user2GroupMapping) {
        this.user2GroupMapping = user2GroupMapping;
    }

}
