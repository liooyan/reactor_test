package com.lioyan.reactor.create;

import reactor.core.publisher.Mono;

/**
 * {@link CallableTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  11:17
 */
public class CallableTest {
    public static void main(String[] args) {


        Mono<String> mono = Mono.fromCallable(() -> "12314");
        mono.subscribe(System.out::println);

        mono = Mono.fromRunnable(() -> System.out.println(1234));
        mono.subscribe(System.out::println);
        mono.subscribe(System.out::println);

    }
}
