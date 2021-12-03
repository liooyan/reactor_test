package com.lioyan.reactor.create;

import reactor.core.publisher.Flux;

/**
 * {@link HandleTest}
 *
 * @author com.lioyan
 * @date 2021/12/3  11:11
 */
public class HandleTest {


    public static void main(String[] args) {

        Flux.just(1,2,3,4,5)
                .handle((a,b) ->{
                    b.next(a+1);
                })
                .subscribe(System.out::println);

    }
}
