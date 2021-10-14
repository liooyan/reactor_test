package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * {@link CollectMap}
 *
 * @author com.lioyan
 * @date 2021/10/13  15:22
 */
public class CollectMap {

    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        Map<String, String> block = strJust.collectMap(Function.identity())
                .block();
        System.out.println(block);


         strJust = Flux.just("1q", "2q", "3q", "2q", "3q");
        Map<String, Collection<String>> block2 = strJust.collectMultimap(Function.identity())
                .block();
        System.out.println(block2);

    }
}
