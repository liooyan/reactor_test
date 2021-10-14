package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Collectors;

/**
 * {@link Count}
 *
 * @author com.lioyan
 * @date 2021/10/13  15:22
 */
public class Count {

    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        Long block = strJust.count().block();
        System.out.println(block);



    }
}
