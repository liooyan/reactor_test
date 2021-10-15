package com.lioyan.reactor.error;

import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * {@link Error}
 *
 * @author com.lioyan
 * @date 2021/10/15  10:09
 */
public class Error {
    public static void main(String[] args) {

        Flux.just(1, 3, 0, 4, 2)
                .error(Exception::new)
                .subscribe(System.out::println);
    }
}
