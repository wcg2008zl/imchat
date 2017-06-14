package com.wcg.chat.session;

import java.util.List;

import com.wcg.chat.entity.User;

/**
 * Created by a on 2017-06-09.
 */
public class SessionContext {

    private User currentUser;

    /**
     *
     * 当前正在通话的单个对象
     */

    private List<User> currentChatUsers;

    /**
     *
     * 下发的会话token
     */
    private String token;

    /**
     * 会话开始时间;
     * */

    private long loginTime;


    //private Map<Integer,>








}