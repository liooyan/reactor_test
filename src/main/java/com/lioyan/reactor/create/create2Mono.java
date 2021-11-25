package com.lioyan.reactor.create;

import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * {@link create2Mono}
 *
 * @author com.lioyan
 * @date 2021/11/17  9:33
 */
public class create2Mono {
    public static void main(String[] args) {
        List<Consumer<Integer>> list = new ArrayList<>();
        Mono<Object> objectMono = Mono.create(sink -> {
            new Thread(()-> sink.success("success")).start();

        }).doOnNext(System.out::println);

        objectMono.subscribe();
        objectMono.subscribe();


//        for (Consumer<Integer> integerConsumer : list) {
//            integerConsumer.accept(200);
//        }

    }
}
