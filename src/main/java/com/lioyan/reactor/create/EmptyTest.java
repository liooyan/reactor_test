package com.lioyan.reactor.create;

import reactor.core.publisher.Mono;

/**
 * {@link EmptyTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  11:36
 */
public class EmptyTest {
    public static void main(String[] args) {

        Mono<String> empty = Mono.empty();

    }
}
