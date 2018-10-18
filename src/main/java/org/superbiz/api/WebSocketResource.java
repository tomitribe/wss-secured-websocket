package org.superbiz.api;
/*
 * Tomitribe Confidential
 *
 * Copyright Tomitribe Corporation. 2018
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */


import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/socket")
public class WebSocketResource {

    @OnOpen
    public void onOpen(final Session session) throws Exception {
        session.getBasicRemote().sendText("Hello " + session.getUserPrincipal().getName());
//        try {
//            session.getBasicRemote().sendText("Hello");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}
