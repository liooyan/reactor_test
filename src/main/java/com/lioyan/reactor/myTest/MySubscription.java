package com.lioyan.reactor.myTest;

import org.reactivestreams.Subscription;

import java.util.function.Function;

/**
 * {@link MySubscription}
 *
 * @author com.lioyan
 * @date 2021/10/19  14:07
 */
public class MySubscription<T> implements Subscription {

    private Function<T,Object> function;

    public MySubscription(Function<T, Object> function) {
        this.function = function;
    }

    @Override
    public void request(long n) {
        for (long i = 0; i < n; i++) {
            function.apply(null);
        }
    }

    @Override
    public void cancel() {

    }
}
