package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link DefaultIfEmpty}
 *
 * @author com.lioyan
 * @date 2021/10/14  14:20
 */
public class DefaultIfEmpty {


    public static void main(String[] args) {

        Flux<String> strJust = Flux.just()
                .cast(String.class)
                .defaultIfEmpty("qqqq");

        strJust.subscribe(System.out::println);
    }
}
