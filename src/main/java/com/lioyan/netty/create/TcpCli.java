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

    public static void main(String[] args) {
        Connection connection =
                TcpClient.create()
                        .host("127.0.0.1")
                        .port(8080)
                        .handle((inbound, outbound) -> {

                            ByteBufFlux receive = inbound.receive();
                            Flux<String> map = receive.asInputStream().map(s -> {
                                byte[] bytes = new byte[1024];
                                try {
                                    int read = s.read(bytes);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                String s1 = new String(bytes);
                                System.out.println(s1);
                                return s1;

                            });

                            return outbound.sendString(map);

                        })
                        .connectNow();

        connection.onDispose()
                .block();
    }

}
