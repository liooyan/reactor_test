package com.lioyan.reactor.time;

import reactor.core.publisher.Flux;

/**
 * {@link Elapsed}
 *
 * @author com.lioyan
 * @date 2021/10/15  13:56
 */
public class Elapsed {
    public static void main(String[] args) {
        Flux.just(1, 3, 0, 4, 2,1)
                .elapsed()
                .map(s ->{
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return s;
                })
                .subscribe(System.out::println);


    }
}
