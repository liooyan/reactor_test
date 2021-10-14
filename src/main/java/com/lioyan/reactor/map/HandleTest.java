package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link HandleTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  14:54
 */
public class HandleTest {

    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        strJust.handle((value, sink) -> {
            sink.next(value+"1");
        }).subscribe(System.out::println);


    }
}
