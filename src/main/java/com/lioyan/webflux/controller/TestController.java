package com.lioyan.webflux.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * {@link TestController}
 *
 * @author com.lioyan
 * @date 2021/10/19  9:45
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public Flux<String> hello(String qq) {
        return Flux.just("Welcome to reactive world ~","Welcome to reactive world ~","Welcome to reactive world ~");
    }

    @GetMapping(value = "/3", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    private Flux<String> flux() {
        return  Flux
                .fromStream(IntStream.range(1, 5).mapToObj(i ->
                        "flux data--" + i)).doOnNext(s ->{
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
    }
}
