package com.lioyan.reactor.peeking;

import reactor.core.publisher.Flux;

/**
 * {@link DoOnNext}
 *
 * @author com.lioyan
 * @date 2021/10/14  15:26
 */
public class DoOnNext {

    public static void main(String[] args) {
        Flux.just("1q", "2q", "3q")
                .doOnNext(System.out::println)
                .subscribe(System.out::println);



    }
}
