package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link Then}
 *
 * @author com.lioyan
 * @date 2021/10/14  14:46
 */
public class Then {
    public static void main(String[] args) {


        Flux.just("qqqq", "qqqq2")
                .map(s ->{
                    System.out.println(111);
                    return s;
                })
                .then()
                .subscribe(System.out::println);
    }
}
