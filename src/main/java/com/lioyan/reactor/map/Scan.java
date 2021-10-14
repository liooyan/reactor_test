package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link Scan}
 *
 * @author com.lioyan
 * @date 2021/10/14  11:08
 */
public class Scan {
    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        Flux<String> block = strJust.scan((a, b) -> a + "_" + b);
        block.subscribe(System.out::println);
    }
}
