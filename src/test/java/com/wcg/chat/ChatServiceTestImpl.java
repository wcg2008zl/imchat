package com.wcg.chat;

import java.util.List;

import com.wcg.chat.entity.ChatSnapshot;
import com.wcg.chat.entity.Msg;
import com.wcg.chat.entity.User;
import com.wcg.chat.services.ChatService;

/**
 * Created by a on 2017-06-16.
 */
public class ChatServiceTestImpl implements ChatService {
    @Override
    public void flushChatMsg(Msg msg) {

    }

    @Override
    public List<ChatSnapshot> readAllUserChatSnapshotByUserId(User user) {
        return null;
    }

    @Override
    public List<ChatSnapshot> readAllGroupChatSnapshot() {
        return null;
    }
}
