package com.lioyan.reactor.splitting;

import reactor.core.publisher.Flux;

/**
 * {@link Window}
 *
 * @author com.lioyan
 * @date 2021/10/15  16:41
 */
public class Window {

    public static void main(String[] args) {
        Flux.just(1, 3, 0, 4, 2,1,5,64,12,64,754,234,16,7,8,9,7,54)
                .window(3)
                .flatMap(s->s.reduce(Integer::sum))
                .subscribe(System.out::println);
    }

}
