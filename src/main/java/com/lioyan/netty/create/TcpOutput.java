package com.lioyan.netty.create;

import reactor.core.publisher.Mono;
import reactor.netty.ByteBufFlux;
import reactor.netty.DisposableServer;
import reactor.netty.tcp.TcpServer;

/**
 * {@link TcpOutput}
 *
 * @author com.lioyan
 * @date 2021/10/22  14:39
 */
public class TcpOutput {


    public static void main(String[] args) {
        DisposableServer server =
                TcpServer.create()
                        .port(8080)
                        .handle((inbound, outbound) -> {
                            ByteBufFlux receive = inbound.receive();
                            receive.asString().subscribe(System.out::println);

                            return outbound.sendString(Mono.just("hello34"));
                        })
                        .bindNow();

        server.onDispose()
                .block();
    }

}

