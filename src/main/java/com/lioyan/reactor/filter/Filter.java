package com.lioyan.reactor.filter;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * {@link Filter}
 *
 * @author com.lioyan
 * @date 2021/10/15  13:33
 */
public class Filter {
    public static void main(String[] args) {


        Flux.just(1, 3, 0, 4, 2)
                .filter(s -> s == 0)
                .subscribe(System.out::println);


        Flux.just(1, 3, 0, 4, 2)
                .filterWhen(s -> s >=2 ? Mono.just(true): Mono.just(false))
                .subscribe(System.out::println);

    }
}
