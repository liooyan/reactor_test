package com.lioyan.reactor.peeking;

import reactor.core.publisher.Flux;

/**
 * {@link DoOnComplete}
 *
 * @author com.lioyan
 * @date 2021/10/14  15:50
 */
public class DoOnComplete {

    public static void main(String[] args) {
        Flux<String> stringFlux = Flux.just("1q", "2q", "3q")
                .doOnComplete(() -> System.out.println(2134));
        stringFlux.subscribe(System.out::println);
        stringFlux.subscribe(System.out::println);



    }
}
