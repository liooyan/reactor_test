package com.lioyan.reactor.peeking;

import reactor.core.publisher.Flux;

/**
 * {@link DoFirst}
 *
 * @author com.lioyan
 * @date 2021/10/14  17:38
 */
public class DoFirst {
    public static void main(String[] args) {
        Flux.just(1, 3, 0, 4, 2)
                .doFirst(()-> System.out.println("qqq"))
                .subscribe(System.out::println);

    }
}
