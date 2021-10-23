package com.lioyan.netty.create;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.ByteBufFlux;
import reactor.netty.Connection;
import reactor.netty.tcp.TcpClient;

import java.io.IOException;

/**
 * {@link TcpCli}
 *
 * @author com.lioyan
 * @date 2021/10/22  15:50
 */
public class TcpCli {

    public static void main(String[] args) throws InterruptedException {
        Connection connection =
                TcpClient.create()
                        .port(8080)
                        .handle((inbound, outbound) -> inbound.receive().asString().doOnNext(System.out::println).then())
                        .connectNow();

        connection.outbound()
                .sendString(Mono.just("hello 1"))
                .then()
                .subscribe();
        connection.outbound()
                .sendString(Mono.just("hello 2"))
                .then()
                .subscribe();

        connection.onDispose();

        Thread.sleep(1000000);
    }

}
