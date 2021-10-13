package com.lioyan.reactor.create;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * {@link ErrorTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  11:36
 */
public class ErrorTest {
    public static void main(String[] args) {

        Mono<Object> error = Mono.error(Exception::new);
        error.subscribe();

    }
}
