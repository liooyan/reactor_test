package com.lioyan.netty.create;

import reactor.core.publisher.Mono;
import reactor.netty.DisposableServer;
import reactor.netty.tcp.TcpServer;

/**
 * {@link TcpEvent}
 *
 * @author com.lioyan
 * @date 2021/10/22  14:39
 */
public class TcpEvent {


        public static void main(String[] args) {
            DisposableServer server =
                    TcpServer.create()
                            .port(8080)




                            .handle((inbound, outbound) -> outbound.sendString(Mono.just("hello")))
                            .bindNow();

            server.onDispose()
                    .block();
        }

}

