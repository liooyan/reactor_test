package com.lioyan.reactor.error;

import reactor.core.publisher.Flux;

/**
 * {@link OnErrorReturn}
 *
 * @author com.lioyan
 * @date 2021/10/15  10:38
 */
public class OnErrorReturn {
    public static void main(String[] args) {

        Flux.just(1, 3, 0, 4, 2)
                .map(s -> 1/s)
                .onErrorReturn(-99)
                .subscribe(System.out::println);
    }
}
