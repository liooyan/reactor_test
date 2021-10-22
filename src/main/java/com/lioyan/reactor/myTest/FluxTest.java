package com.lioyan.reactor.myTest;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import java.util.function.Function;

/**
 * {@link FluxTest}
 *
 * @author com.lioyan
 * @date 2021/10/19  14:05
 */
public class FluxTest<T> implements Publisher<T> {
    @Override
    public void subscribe(Subscriber<? super T> s) {
    }

    public void subscribe(Function<T,Object> function) {
        MySubscription<T> tMySubscription = new MySubscription<>(function);
        new MySubscriber<>().onSubscribe(tMySubscription);
    }


}
