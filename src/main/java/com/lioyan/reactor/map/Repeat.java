package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link Repeat}
 *
 * @author com.lioyan
 * @date 2021/10/14  14:05
 */
public class Repeat {

    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        Flux<String> repeat = strJust.repeat(2L);
        repeat.subscribe(System.out::println);
    }
}
