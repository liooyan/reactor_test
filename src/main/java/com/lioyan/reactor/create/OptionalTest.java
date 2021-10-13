package com.lioyan.reactor.create;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * {@link OptionalTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  10:07
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String>  optionalS =  Optional.of("test");
        Mono<String> mono = Mono.justOrEmpty(optionalS);
        mono.subscribe(System.out::println);


        mono = Mono.justOrEmpty(null);
        mono.subscribe(System.out::println);


        mono = Mono.justOrEmpty(Optional.empty());
        mono.subscribe(System.out::println);


        mono = Mono.just(null);
        mono.subscribe(System.out::println);

    }
}
