package com.lioyan.reactor.filter;

import reactor.core.publisher.Flux;

/**
 * {@link Skip}
 *
 * @author com.lioyan
 * @date 2021/10/15  13:46
 */
public class Skip {
    public static void main(String[] args) {
        Flux.just(1, 3, 0, 4, 2,1)
                .skip(3)
                .subscribe(System.out::println);


    }
}
