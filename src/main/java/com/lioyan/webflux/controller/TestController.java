package com.lioyan.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * {@link TestController}
 *
 * @author com.lioyan
 * @date 2021/10/19  9:45
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public Flux<String> hello() {
        return Flux.just("Welcome to reactive world ~","Welcome to reactive world ~","Welcome to reactive world ~");
    }
}
