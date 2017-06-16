package com.wcg.chat.entity;

/**
 * Created by a on 2017-06-14.
 */
public class Msg {

    private MsgType MsgType;

    private byte[] content;

    public com.wcg.chat.entity.MsgType getMsgType() {
        return MsgType;
    }

    public void setMsgType(com.wcg.chat.entity.MsgType msgType) {
        MsgType = msgType;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
