package com.wcg.chat.entity;

/**
 * Created by a on 2017-06-14.
 *
 * 消息快照
 */
public class ChatSnapshot {

    private int fromUserId;


    private int toUserId;

    private Msg msg;


    private long msgTime;

    public long getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(long msgTime) {
        this.msgTime = msgTime;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    public int getToUserId() {
        return toUserId;
    }

    public void setToUserId(int toUserId) {
        this.toUserId = toUserId;
    }

    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
    }






}
