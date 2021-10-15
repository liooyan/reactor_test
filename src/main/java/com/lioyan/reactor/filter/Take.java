package com.lioyan.reactor.filter;

import reactor.core.publisher.Flux;

/**
 * {@link Take}
 *
 * @author com.lioyan
 * @date 2021/10/15  13:41
 */
public class Take {

    public static void main(String[] args) {
        Flux.just(1, 3, 0, 4, 2,1)
                .take(3)
                .subscribe(System.out::println);

        Flux.just(1, 3, 0, 4, 2,1)
                .map(s ->{
                    System.out.println(s);
                    return s;
                })
                .take(3,false)
                .subscribe();

    }

}
