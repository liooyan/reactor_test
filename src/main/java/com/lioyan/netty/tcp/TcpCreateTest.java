package com.lioyan.netty.tcp;

import reactor.netty.DisposableServer;
import reactor.netty.tcp.TcpServer;

/**
 * {@link TcpCreateTest}
 *
 * @author com.lioyan
 * @date 2021/10/22  14:14
 */
public class TcpCreateTest {


    public static void main(String[] args) {
        DisposableServer server =
                TcpServer.create()
                        .host("localhost")
                        .port(8080)
                        .bindNow();

        server.onDispose()
                .block();
    }

}
