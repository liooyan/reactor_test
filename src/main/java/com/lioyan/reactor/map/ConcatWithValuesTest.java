package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link ConcatWithValuesTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  15:17
 */
public class ConcatWithValuesTest {
    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        strJust.concatWithValues("1","2","3")
                .subscribe(System.out::println);

    }
}
