package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

import java.util.List;

/**
 * {@link CollectList}
 *
 * @author com.lioyan
 * @date 2021/10/13  15:22
 */
public class CollectList {

    public static void main(String[] args) {

        Flux<String> strJust = Flux.just("1q", "2q", "3q");
        List<String> block = strJust.collectList()
                .block();
        System.out.println(block);

         strJust = Flux.just("2q", "1q", "3q");
         block = strJust.collectSortedList()
                .block();
        System.out.println(block);

    }
}
