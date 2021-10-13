package com.lioyan.reactor.create;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * {@link DelayTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  11:40
 */
public class DelayTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Disposable disposable = Mono.delay(Duration.ofSeconds(2)).subscribe(n -> {
            System.out.println("生产数据源："+ n);
            System.out.println("当前线程ID："+ Thread.currentThread().getId() + ",生产到消费耗时："+ (System.currentTimeMillis() - start));
        });
        System.out.println("主线程"+ Thread.currentThread().getId() + "耗时："+ (System.currentTimeMillis() - start));
        while(!disposable.isDisposed()) {
        }


    }
}
