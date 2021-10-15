package com.lioyan.reactor.filter;

import reactor.core.publisher.Flux;

/**
 * {@link Distinct}
 *
 * @author com.lioyan
 * @date 2021/10/15  13:38
 */
public class Distinct {

    public static void main(String[] args) {
        Flux.just(1, 3, 0, 4, 2,1)
                .distinct()
                .subscribe(System.out::println);



        Flux.just(1, 3, 0, 4, 2,1)
                .distinct((a) -> a-1 )
                .subscribe(System.out::println);
    }
}
