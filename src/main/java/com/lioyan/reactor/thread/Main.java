package com.lioyan.reactor.thread;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * {@link Main}
 *
 * @author com.lioyan
 * @date 2021/10/26  14:59
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {

        Flux.just("1","2","3","4")
                .doOnNext(s ->  System.out.println(Thread.currentThread().getName()))
                .publishOn(Schedulers.boundedElastic())
                .doOnNext(s ->  System.out.println(Thread.currentThread().getName()))
                //.publishOn(Schedulers.boundedElastic())
                .doOnNext(s ->  System.out.println(Thread.currentThread().getName()))
                .doOnNext(s ->  System.out.println(Thread.currentThread().getName()))
                .subscribe(System.out::println);


        TimeUnit.SECONDS.sleep(5);
    }
}
