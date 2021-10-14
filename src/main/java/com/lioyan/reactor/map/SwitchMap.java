package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.util.List;

/**
 * {@link SwitchMap}
 *
 * @author com.lioyan
 * @date 2021/10/14  11:47
 */
public class SwitchMap {
    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        Flux<String> stringFlux = strJust.switchMap(s -> Flux.just(s, "2q", "3q"));
        Flux<String> stringFlux2 = strJust.flatMap(s -> Flux.just(s, "2q", "3q"));
        stringFlux.subscribe(System.out::println);


    }
}
