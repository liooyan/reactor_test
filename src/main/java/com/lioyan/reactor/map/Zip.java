package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

/**
 * {@link Zip}
 *
 * @author com.lioyan
 * @date 2021/10/14  11:36
 */
public class Zip {

    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        Flux<Integer> strJust2 = Flux.just(1,2,3,5);
        Flux<Tuple2<String, Integer>> stringFlux = strJust.zipWith(strJust2);
        stringFlux.subscribe(System.out::println);
    }
}
