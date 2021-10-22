package com.lioyan.reactor.myTest;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * {@link MySubscriber}
 *
 * @author com.lioyan
 * @date 2021/10/19  16:02
 */
public class MySubscriber<T> implements Subscriber<T> {


    @Override
    public void onSubscribe(Subscription s) {
        while (true){
            s.request(1);
        }
    }

    @Override
    public void onNext(T t) {

    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onComplete() {

    }
}
