package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link Reduce}
 *
 * @author com.lioyan
 * @date 2021/10/14  10:19
 */
public class Reduce {
    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        String block = strJust.reduce((a, b) -> a + "_" + b).block();

        System.out.println(block);

        String block1 = strJust.reduceWith(() -> "-1", (a, b) -> a + "_" + b).block();

        System.out.println(block1);

    }
}
