package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link IgnoreElements}
 *
 * @author com.lioyan
 * @date 2021/10/14  14:43
 */
public class IgnoreElements {
    public static void main(String[] args) {


        Flux.just("qqqq", "qqqq2")
                .map(s ->{
                    System.out.println(111);
                    return s;
                })
                .ignoreElements()
                .subscribe(System.out::println);
    }
}
