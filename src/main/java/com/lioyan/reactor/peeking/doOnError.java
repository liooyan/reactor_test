package com.lioyan.reactor.peeking;

import reactor.core.publisher.Flux;

/**
 * {@link doOnError}
 *
 * @author com.lioyan
 * @date 2021/10/14  16:03
 */
public class doOnError {

    public static void main(String[] args) {
        Flux.just(1, 3, 0, 4, 2)
                .map(s -> 1 / s)
                .doOnError(Throwable::printStackTrace)

                .subscribe(System.out::println);

    }
}
