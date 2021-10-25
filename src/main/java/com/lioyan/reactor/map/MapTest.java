package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * {@link MapTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  14:06
 */
public class MapTest {
    public static void main(String[] args) {
        Flux.just("1q", "2q", "3q")
                .map(s -> s + ":qqq")
                .filter(s -> s.equals("2q:qqq"))
                .subscribe(System.out::println);


    }
}
