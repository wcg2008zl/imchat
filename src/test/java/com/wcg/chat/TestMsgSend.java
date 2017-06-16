package com.wcg.chat;

import java.util.List;

import com.wcg.chat.entity.ChatSnapshot;
import com.wcg.chat.entity.Msg;
import com.wcg.chat.entity.MsgType;
import com.wcg.chat.entity.Token;
import com.wcg.chat.entity.User;
import com.wcg.chat.services.ChatService;
import com.wcg.chat.services.LoginService;
import com.wcg.chat.services.TokenService;
import com.wcg.chat.services.UserService;
import com.wcg.chat.session.Session;
import com.wcg.chat.session.SessionService;
import org.junit.Test;

/**
 * Created by a on 2017-06-16.
 */
public class TestMsgSend {


    @Test

    public  void testSend() {

        SessionService sessionService = null; //to be impl

        UserService userService = null; //to be impl

        //mock msg////
        ChatSnapshot chatSnapshot = new ChatSnapshot();

        Msg msg = new Msg();


        msg.setMsgType(MsgType.P2PRAW);

        msg.setContent("hellow".getBytes());

        chatSnapshot.setFromUserId(1);

        chatSnapshot.setToUserId(2);

        //////mock end///

        ////find session////


        User toUser =
            userService.findUserInfoByUserId(chatSnapshot.getToUserId());


        if(toUser != null) {

            Session toSendSession = sessionService.getUserSessionOnline(toUser);

            toSendSession.sendAndFlushMsg(chatSnapshot);

        }
        ////fined ////
    }


    @Test

    public void testLogin() {

        LoginService loginService = null;

        TokenService tokenService = null;

        SessionService sessionService = null;


        User user = loginService.checkLogin("123","456");

        if(user != null) {

            Token  token = tokenService.genareateToken(user);

            if( token != null ) {

                Session session = sessionService.registerSession(user);//注册Session


                //return token to user cli;

            }
        }

    }


    public  void testLoginOut() {

        LoginService loginService = null;

        SessionService sessionService = null;

        TokenService tokenService = null;

        User user = new User();
        Token token = new Token();

        loginService.loginOut(user);

        tokenService.expriToken(user,token)
;
        sessionService.unregisterSession(user);
    }

    public void testQueryChatView() {
            ////it will get from req package
            Token token = new Token();

            User user = new User();


            SessionService sessionService = null;

            TokenService tokenService = null;

            ChatService chatService = null;

            boolean result = tokenService.checkToken(user,token);

            if( result ) {

                Session session = sessionService .getUserSessionOnline(user);

                if(session != null) {

                    List<ChatSnapshot> chatSnapshots = chatService.readAllUserChatSnapshotByUser(user);

                    //send this view

                }
            }
    }

    @Test

    public void testLatch() {


    }
}
