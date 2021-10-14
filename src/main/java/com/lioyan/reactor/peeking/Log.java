package com.lioyan.reactor.peeking;

import reactor.core.publisher.Flux;

import java.util.logging.Level;

/**
 * {@link Log}
 *
 * @author com.lioyan
 * @date 2021/10/14  17:43
 */
public class Log {

    public static void main(String[] args) {
        Flux.just(1, 3, 0, 4, 2)
                .log("测试", Level.WARNING)
                .subscribe(System.out::println);

    }
}
