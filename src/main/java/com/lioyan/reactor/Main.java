package com.lioyan.reactor;

import reactor.core.publisher.Flux;

/**
 * {@link Main}
 *
 * @author com.lioyan
 * @date 2021/10/9  16:48
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Mono.just(1);
        Flux<String> seq1 = Flux.just("foo", "bar", "foobar");

//
//        List<String> iterable = Arrays.asList("foo", "bar", "foobar");
//        Flux<String> seq2 = Flux.fromIterable(iterable);
//
//        Disposable subscribe = seq2.subscribe(System.out::println);
//
//        Flux.just("a", "b","1")
//                .zipWith(Flux.just("c", "d","qwe"))
//                .subscribe(System.out::println);
//        Flux.just("a", "b")
//                .zipWith(Flux.just("c", "d"), (s1, s2) -> String.format("%s-%s", s1, s2))
//                .subscribe(System.out::println);


//        Flux<String> flux = Flux.generate(
//                () -> 9,
//                (state, sink) -> {
//                    sink.next("3 x " + state + " = " + 3 * state);
//                    if (state == 10)  sink.complete();
//                    return state + 1;
//                });

//        flux.subscribe(System.out::println);

//        Function<Flux<String>, Flux<String>> filterAndMap =
//                f -> f.filter(color -> !color.equals("orange"))
//                        .map(String::toUpperCase);
//
//        Flux.fromIterable(Arrays.asList("blue", "green", "orange", "purple"))
//                .doOnNext(System.out::println)
//                .transform(filterAndMap)
//                .subscribe(d -> System.out.println("Subscriber to Transformed MapAndFilter: "+d));


//        AtomicInteger ai = new AtomicInteger();
//        Function<Flux<String>, Flux<String>> filterAndMap = f -> {
//            if (ai.incrementAndGet() == 1) {
//                return f.filter(color -> !color.equals("orange"))
//                        .map(String::toUpperCase);
//            }
//            return f.filter(color -> !color.equals("purple"))
//                    .map(String::toUpperCase);
//        };
//
//        Flux<String> composedFlux =
//                Flux.fromIterable(Arrays.asList("blue", "green", "orange", "purple"))
//                        .doOnNext(System.out::println)
//                        .transformDeferred(filterAndMap);
//
//        composedFlux.subscribe(d -> System.out.println("Subscriber 1 to Composed MapAndFilter :"+d));
//        composedFlux.subscribe(d -> System.out.println("Subscriber 2 to Composed MapAndFilter: "+d));

//
//        Flux<String> source = Flux.fromIterable(Arrays.asList("blue", "green", "orange", "purple"))
//                .map(String::toUpperCase);
//
//        source.subscribe(d -> System.out.println("Subscriber 1: "+d));
//        source.subscribe(d -> System.out.println("Subscriber 2: "+d));



//        Sinks.Many<String> hotSource = Sinks.unsafe().many().multicast().directBestEffort();
//
//        Flux<String> hotFlux = hotSource.asFlux().map(String::toUpperCase);
//
//        hotFlux.subscribe(d -> System.out.println("Subscriber 1 to Hot Source: "+d));
//
//        hotSource.emitNext("blue", FAIL_FAST);
//        hotSource.tryEmitNext("green").orThrow();
//
//        hotFlux.subscribe(d -> System.out.println("Subscriber 2 to Hot Source: "+d));
//
//        hotSource.emitNext("orange", FAIL_FAST);
//        hotSource.emitNext("purple", FAIL_FAST);
//        hotSource.emitComplete(FAIL_FAST);


//        Flux<Integer> source = Flux.range(1, 3)
//                .doOnSubscribe(s -> System.out.println("subscribed to source"));
//
//        ConnectableFlux<Integer> co = source.publish();
//
//        co.subscribe(System.out::println, e -> {}, () -> {});
//        co.subscribe(System.out::println, e -> {}, () -> {});
//
//        System.out.println("done subscribing");
//        Thread.sleep(500);
//        System.out.println("will now connect");
//
//        co.connect();





    }
}
