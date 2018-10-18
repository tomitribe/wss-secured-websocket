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


//
//import org.java_websocket.client.WebSocketClient;
//import org.java_websocket.handshake.ServerHandshake;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import javax.websocket.ContainerProvider;
import javax.websocket.WebSocketContainer;
import java.io.FileInputStream;
import java.net.URI;
import java.net.URL;
import java.security.KeyStore;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;

@RunAsClient
@RunWith(Arquillian.class)
public class WebSocketResourceDirectTest {

    private static final int PORT = 33333;


    @ArquillianResource()
    private URL url;


    @Deployment(name = "cve", testable = false)
    public static final WebArchive app() {
        return ShrinkWrap.create(WebArchive.class, "cve.war")
                .addClasses(WebSocketResource.class);
    }

    @Test
    public void sayHi() throws Exception {

//        String STORETYPE = "JKS";
//        String KEYSTORE = System.getProperty("javax.net.ssl.keyStore");
//        String STOREPASSWORD = "123456";
//        String KEYPASSWORD = "123cxf websocket client456";
//
//        final WebSocketContainer container = ContainerProvider.getWebSocketContainer();
//
//        KeyStore ks = KeyStore.getInstance(STORETYPE);
//        ks.load(new FileInputStream(KEYSTORE), STOREPASSWORD.toCharArray());
//        KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
//        kmf.init(ks, KEYPASSWORD.toCharArray());
//        TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
//        tmf.init(ks);
//
//        SSLContext sslContext = null;
//        sslContext = SSLContext.getInstance("TLS");
//        sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
//        sslContext.getSocketFactory();
//        SSLSocketFactory factory = sslContext.getSocketFactory();
//
//        final AtomicReference<String> message = new AtomicReference<>();
//        final CountDownLatch latch = new CountDownLatch(1);
//        WebSocketClient client = new WebSocketClient(new URI("wss://www.example.org:33333/cve/socket")) {
//            @Override
//            public void onOpen(final ServerHandshake serverHandshake) {
////                message.set(serverHandshake.getHttpStatusMessage());
////                latch.countDown();
//            }
//
//            @Override
//            public void onMessage(final String s) {
//                message.set(s);
//                latch.countDown();
//            }
//
//            @Override
//            public void onClose(final int i,
//                                final String s,
//                                final boolean b) {
//            }
//
//            @Override
//            public void onError(final Exception e) {
//            }
//        };
//
//        client.setSocket(factory.createSocket());
//        client.connectBlocking();
//
//        latch.await(50, TimeUnit.SECONDS);
//        client.close();
//
//        assertEquals("Hello", message.get());
    }

}
