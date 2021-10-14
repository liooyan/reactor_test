package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link FlatMapTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  14:49
 */
public class FlatMapTest {

    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        strJust.flatMap(s -> Flux.just(s, "1"))
                .subscribe(System.out::println);
    }
}
