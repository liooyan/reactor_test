package com.lioyan.reactor.time;

import reactor.core.publisher.Flux;

/**
 * {@link Timed}
 *
 * @author com.lioyan
 * @date 2021/10/15  13:52
 */
public class Timed {
    public static void main(String[] args) {
        Flux.just(1, 3, 0, 4, 2,1)
                .timed()
                .map(reactor.core.publisher.Timed::timestamp)
                .subscribe(System.out::println);


    }
}
