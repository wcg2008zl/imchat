package com.wcg.chat.services;

import com.wcg.chat.entity.Group;
import com.wcg.chat.entity.User;

import java.util.List;

/**
 * Created by a on 2017-06-14.
 */
public interface GroupService extends EntityService<Group> {

        /**
         *
         * 根据用户Id查询相应的群组信息
         *
         * */

        public List<Group> findGroupsByUser(User user);


        /**
         *
         * 按群组ID查询该群组下的所有用户
         *
         * */

        public List<Integer> findUsersByGroupId(int groupId);


        /**
         *
         * 向群组中添加用户
         *
         * */


        public boolean addUserToGroup(int groupId,int userId);

        /**
         *
         * 从群组中删除用户
         *
         * */

        public boolean deleteUserFromGroup(int groupId,int userId);




}
