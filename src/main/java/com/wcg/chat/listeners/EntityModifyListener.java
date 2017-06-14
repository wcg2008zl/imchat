package com.wcg.chat.listeners;

/**
 * Created by a on 2017-06-14.
 */
public interface EntityModifyListener<T> {

    public void add(T info);

    public void update(T info);

    public void delete(T info);
}
