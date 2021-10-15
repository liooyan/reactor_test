package com.lioyan.reactor.filter;

import reactor.core.publisher.Flux;

/**
 * {@link OfType}
 *
 * @author com.lioyan
 * @date 2021/10/15  13:37
 */
public class OfType {
    public static void main(String[] args) {

        Flux.just(1,"23",123L,42)
                .ofType(Integer.class)
                .subscribe(System.out::println);
    }
}
