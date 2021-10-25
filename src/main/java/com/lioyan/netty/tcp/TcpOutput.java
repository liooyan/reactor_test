package com.lioyan.netty.tcp;

import reactor.core.publisher.Flux;
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
                            Flux<String> map = receive.asString().map(s -> {
                                Thread t = Thread.currentThread();
                                String name = t.getName();
                                System.out.println("name=" + name);
                                s += "123sdas";
                                return s;
                            });
                            return outbound.sendString(map);
                        })
                        .bindNow();

        server.onDispose()
                .block();
    }

}

