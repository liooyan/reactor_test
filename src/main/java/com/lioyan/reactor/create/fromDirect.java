package com.lioyan.reactor.create;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

/**
 * {@link fromDirect}
 *
 * @author com.lioyan
 * @date 2021/11/23  14:16
 */
public class fromDirect {

    public static void main(String[] args) {

        Flux<Integer> just = Flux.just(1, 2, 3)
                .map(Function.identity());


        Mono.fromDirect(just)
                .subscribe(s -> System.out.println(s));

        Mono.from(just)
                .subscribe(s -> System.out.println(s));
    }
}
