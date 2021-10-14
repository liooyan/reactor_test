package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link SwitchIfEmpty}
 *
 * @author com.lioyan
 * @date 2021/10/14  14:23
 */
public class SwitchIfEmpty {
    public static void main(String[] args) {

        Flux.just()
                .cast(String.class)
                .switchIfEmpty(Flux.just("qqqq", "qqqq2"))
                .subscribe(System.out::println);

    }
}
