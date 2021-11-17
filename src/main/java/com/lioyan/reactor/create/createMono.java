package com.lioyan.reactor.create;

import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * {@link createMono}
 *
 * @author com.lioyan
 * @date 2021/11/17  9:33
 */
public class createMono {
    public static void main(String[] args) {
        List<Consumer<Integer>> list = new ArrayList<>();
        Mono<Object> objectMono = Mono.create(sink -> {
            Consumer<Integer> listener = event -> {
                if (event >= 400) {
                    sink.error(new RuntimeException("Failed"));
                } else {
                    sink.success("success");
                }
            };

            list.add(listener);

            sink.onDispose(() -> System.out.println(123));
        }).doOnNext(System.out::println);

        objectMono.subscribe();


        for (Consumer<Integer> integerConsumer : list) {
            integerConsumer.accept(200);
        }

    }
}
