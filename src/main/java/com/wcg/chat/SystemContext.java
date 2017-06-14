package com.wcg.chat;


import com.wcg.chat.entity.User;
import com.wcg.chat.listeners.GroupListener;
import com.wcg.chat.listeners.UserListener;
import com.wcg.chat.session.SessionContext;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by a on 2017-06-14.
 */
public class SystemContext {





    private Mappings mappings = new Mappings();


    private GroupListener groupListener;

    private UserListener userListener;

    //TODO dont make 2048 writted here;
    private Set<SessionContext> sessionContexts = new HashSet<>(2048);

    private Map<User,SessionContext>  sessionContextMap = new ConcurrentHashMap<>(2048);


    private Object sessionLock = new Object();


    public Mappings getMappings() {
        return mappings;
    }

    public GroupListener getGroupListener() {
        return groupListener;
    }

    public UserListener getUserListener() {
        return userListener;
    }

    public void regGroupListener(GroupListener groupListener) {

        this.groupListener = groupListener;
    }

    public void regUserListener(UserListener userListener) {

        this.userListener = userListener;
    }

    /**
     *
     * TODO:CHECK IF sessionContext is Not REMOVEED
     *
     */


    public void regSessionContext (SessionContext sessionContext) {


        synchronized (sessionLock) {

            sessionContexts.add(sessionContext);
            sessionContextMap.put(sessionContext.getCurrentUser(), sessionContext);
        }

    }


    public void removeSessionContext(SessionContext sessionContext) {

        synchronized (sessionLock) {

            sessionContexts.remove(sessionContext);
            sessionContextMap.remove(sessionContext.getCurrentUser());
        }

    }


    public SessionContext getSessionContextByUser(User user) {


       return sessionContextMap.get(user);

    }



    private static SystemContext _INS = new SystemContext();

    private SystemContext() {


    }

    public static SystemContext getInstance() {

        return _INS;
    }


}
