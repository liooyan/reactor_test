package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

import java.util.function.Predicate;

/**
 * {@link All}
 *
 * @author com.lioyan
 * @date 2021/10/14  11:15
 */
public class All {
    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        Boolean block = strJust.all(a->true).block();

        System.out.println(block);

    }
}
