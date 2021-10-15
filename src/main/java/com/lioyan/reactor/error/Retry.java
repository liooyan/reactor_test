package com.lioyan.reactor.error;

import reactor.core.publisher.Flux;

/**
 * {@link Retry}
 *
 * @author com.lioyan
 * @date 2021/10/15  11:10
 */
public class Retry {
    public static void main(String[] args) {

        Flux.just(1, 3, 0, 4, 2)
                .map(s -> 1 / s)
                .retry(5)
                .subscribe(System.out::println);
    }
}
