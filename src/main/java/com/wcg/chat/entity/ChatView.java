package com.wcg.chat.entity;

import com.wcg.chat.Flushable;

import java.util.List;

/**
 * Created by administrator on 2017/6/14.
 */
public final  class ChatView implements Flushable {

    private int userId;


    private List<ViewNode> views;


    private long lastUpdateTime;

    private long lastFlushTime;






    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<ViewNode> getViews() {
        return views;
    }

    public void setViews(List<ViewNode> views) {
        this.views = views;
    }

    @Override
    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Override
    public long getLastFlushTime() {
        return lastFlushTime;
    }

    public static final class ViewNode {


        private int entityType;

        private int entityId;

        private int unreaded;

        public int getUnreaded() {
            return unreaded;
        }

        public void setUnreaded(int unreaded) {
            this.unreaded = unreaded;
        }

        public int getEntityType() {
            return entityType;
        }

        public void setEntityType(int entityType) {
            this.entityType = entityType;
        }

        public int getEntityId() {
            return entityId;
        }

        public void setEntityId(int entityId) {
            this.entityId = entityId;
        }
    }





}
