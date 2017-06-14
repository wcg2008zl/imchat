package com.wcg.chat.services;

import com.wcg.chat.listeners.EntityModifyListener;

import java.util.List;

/**
 * Created by administrator on 2017/6/14.
 */
public interface EntityService<T> extends EntityModifyListener<T> {


    public List<T> findAllEntity();



}
