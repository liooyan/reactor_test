package com.lioyan.reactor.create;

import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

/**
 * {@link fromFutureTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  11:24
 */
public class fromFutureTest {
static int a = 0;
    public static void main(String[] args) {

        Mono<Integer> integerMono = Mono.fromFuture(() -> new CompletableFuture<Integer>() {
        });


        integerMono.subscribe(System.out::println);


    }
}
