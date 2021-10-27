package com.lioyan.reactor.create;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * {@link Just}
 *
 * @author com.lioyan
 * @date 2021/10/13  9:42
 */
public class Just {


    public static void main(String[] args) {
        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        strJust.subscribe(System.out::println);

        Flux<Integer> intJust = Flux.just(1,2,3,4);
        intJust.subscribe(System.out::println);

        Mono<String> mono = Mono.just("1Mono").map(s -> s).filter(s ->true);
        mono.subscribe(System.out::println);


    }

}
