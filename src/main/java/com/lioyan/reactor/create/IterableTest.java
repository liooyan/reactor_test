package com.lioyan.reactor.create;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link IterableTest}
 *
 * @author com.lioyan
 * @date 2021/10/13  10:51
 */
public class IterableTest {

    public static void main(String[] args) {
        String[] strs = new String[]{"a","b","c","d"};
        Flux<String> stringFlux = Flux.fromArray(strs);
        stringFlux.subscribe(System.out::println);

       List<String> str =  new ArrayList<>();
        str.add("listA");
        str.add("listB");
        str.add("listC");
        str.add("listD");
        stringFlux = Flux.fromStream(str.stream());

        stringFlux.subscribe(System.out::println);


        stringFlux = Flux.fromIterable(str);
        stringFlux.subscribe(System.out::println);

    }
}
