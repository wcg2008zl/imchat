package com.wcg.chat.services;

import com.wcg.chat.entity.Token;
import com.wcg.chat.entity.User;

/**
 * Created by a on 2017-06-16.
 */
public interface TokenService {


    public Token genareateToken(User user);

    public boolean checkToken(User user,Token token);

    public boolean expriToken(User user,Token token);


}
