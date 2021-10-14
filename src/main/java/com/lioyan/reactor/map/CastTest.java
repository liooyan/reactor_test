package com.lioyan.reactor.map;

import reactor.core.publisher.Flux;

/**
 * {@link CastTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  14:14
 */
public class CastTest {


    static class A {

    }

    static class B extends A {
        public int pr() {
            return 11;
        }
    }

    public static void main(String[] args) {

        Flux<A> just = Flux.just(new B(), new B());
        just.cast(B.class)
                .subscribe(s -> System.out.println(s.pr()));

    }
}
