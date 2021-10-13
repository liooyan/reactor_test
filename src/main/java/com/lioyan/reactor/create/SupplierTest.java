package com.lioyan.reactor.create;

import reactor.core.publisher.Mono;

/**
 * {@link SupplierTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  11:12
 */
public class SupplierTest {

    static int anInt = 0;
    public static void main(String[] args) {

        Mono<String> monoStr = Mono.fromSupplier(() -> "qws");
        monoStr.subscribe(System.out::println);

        Mono<Integer> mono = Mono.fromSupplier(() -> anInt++);

        mono.subscribe(System.out::println);
        mono.subscribe(System.out::println);
        mono.subscribe(System.out::println);


    }
}
