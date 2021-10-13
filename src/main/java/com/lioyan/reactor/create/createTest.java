package com.lioyan.reactor.create;

import reactor.core.publisher.Flux;

/**
 * {@link createTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  13:52
 */
public class createTest {
    public static void main(String[] args) {
        Flux.create(sink -> {
            for (int i = 0; i < 10; i++) {
                sink.next(i);
            }
            sink.complete();
        }).subscribe(System.out::println);

    }
}
