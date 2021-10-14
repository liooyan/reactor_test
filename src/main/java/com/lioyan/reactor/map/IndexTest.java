package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link IndexTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  14:33
 */
public class IndexTest {
    public static void main(String[] args) {
        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        strJust.index()
                .map(s -> s.getT1() + "_" + s.getT2() + ":qqq")
                .subscribe(System.out::println);


        strJust.index((index, value) -> index + "_" + value + ":qqq" )
                .subscribe(System.out::println);
    }
}
