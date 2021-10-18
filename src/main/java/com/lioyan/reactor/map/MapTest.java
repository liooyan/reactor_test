package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link MapTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  14:06
 */
public class MapTest {
    public static void main(String[] args) {
        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        Flux<String> cache = strJust.map(s -> s + ":qqq")
                .filter(s -> s.equals("2q:qqq"))
                .cache();

        cache.count()
                .subscribe(System.out::println);




    }
}
