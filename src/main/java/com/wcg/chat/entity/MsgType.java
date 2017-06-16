package com.wcg.chat.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by a on 2017-06-14.
 */
public enum MsgType {

    P2PRAW(1,1),
    P2PIMG(1,2),
    P2PFILE(1,3),
    P2GRAW(2,1),
    P2GIMG(2,2),
    P2GFILE(2,3),
    HARTBEAT(3,0),//心跳
    LOGIN(3,1),//登录
    LOGINOUT(3,2)//登出

    ;

    private int type;
    private int scope;
    private MsgType(int type,int scope){

        this.type = type;
        this.scope = scope;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    private static Map<Integer,Map<Integer,MsgType>> _CACHE = new HashMap<Integer,Map<Integer,MsgType>>(8);


    static {


        for(MsgType item:MsgType.values()) {

            Map<Integer,MsgType> tmpItem = null;
            if((tmpItem = _CACHE.get(item.type))==null) {
                tmpItem = new HashMap<Integer, MsgType>(8);
                _CACHE.put(item.type,tmpItem);
            }
            tmpItem.put(item.scope,item);
        }

    }
    public static MsgType getMsgTypeByTypeAndScope(int type,int scope) {

        Map<Integer,MsgType> nowMapping = null;
        return (nowMapping = _CACHE.get(type))!= null?nowMapping.get(scope):null;

    }


}
