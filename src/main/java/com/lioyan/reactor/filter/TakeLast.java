package com.lioyan.reactor.filter;

import reactor.core.publisher.Flux;

/**
 * {@link TakeLast}
 *
 * @author com.lioyan
 * @date 2021/10/15  13:45
 */
public class TakeLast {
    public static void main(String[] args) {
        Flux.just(1, 3, 0, 4, 2,1)
                .takeLast(3)
                .subscribe(System.out::println);


    }
}
