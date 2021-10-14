package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link ConcatWith}
 *
 * @author com.lioyan
 * @date 2021/10/14  11:36
 */
public class ConcatWith {

    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        Flux<String> strJust2 = Flux.just("1q", "2q", "3q");
        Flux<String> stringFlux = strJust.concatWith(strJust2);
        stringFlux.subscribe(System.out::println);
    }
}
