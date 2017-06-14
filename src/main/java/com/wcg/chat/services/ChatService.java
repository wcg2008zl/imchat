package com.wcg.chat.services;

import java.util.List;

import com.wcg.chat.entity.ChatSnapshot;
import com.wcg.chat.entity.Msg;
import com.wcg.chat.entity.User;

/**
 * Created by a on 2017-06-14.
 */
public interface ChatService {

    public void  flushChatMsg(Msg msg);

    public List<ChatSnapshot> readAllUserChatSnapshotByUserId(User user);

    public List<ChatSnapshot> readAllGroupChatSnapshot();


}
