package com.wcg.chat.chat;

import com.wcg.chat.entity.ChatSnapshot;
import com.wcg.chat.entity.Msg;

/**
 * Created by a on 2017-06-14.
 */
public interface Store {

    public void flushMsg(ChatSnapshot msg);




}
