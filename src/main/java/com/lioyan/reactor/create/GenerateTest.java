package com.lioyan.reactor.create;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Random;

/**
 * {@link GenerateTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  13:33
 */
public class GenerateTest {


    public static void main(String[] args) {

        Flux.generate(sink -> {
            sink.next("Hello");
            sink.complete();
        }).subscribe(System.out::println);


        final Random random = new Random();
        Flux.generate(ArrayList::new, (list, sink) -> {
            int value = random.nextInt(100);
            list.add(sink);
            sink.next(random.nextInt(100));
            if (list.size() == 10) sink.complete();
            return list;
        }).subscribe(System.out::println);


        Flux.generate(() -> 0, (num, sink) -> {
            if (num == 1) sink.complete();
            sink.next(num += 1);
            return num;
        }).subscribe(System.out::println);

    }
}
