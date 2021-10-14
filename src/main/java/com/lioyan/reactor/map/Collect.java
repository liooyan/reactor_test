package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * {@link Collect}
 *
 * @author com.lioyan
 * @date 2021/10/13  15:22
 */
public class Collect {

    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        String block = strJust.reduce((a, b) -> a + "_" + b).block();

        System.out.println(block);

        String block1 = strJust.reduceWith(() -> "-1", (a, b) -> a + "_" + b).block();

        System.out.println(block1);


    }
}
