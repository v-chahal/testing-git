package com.codingsaint.learning.rxjava.subcriber;

import com.codingsaint.learning.rxjava.utils.RxUtils;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

public class DemoSubscriber implements Subscriber {
    private static final Logger logger = LoggerFactory.getLogger(DemoSubscriber.class);
    public AtomicInteger counter = new AtomicInteger();
    public Subscription subscription;

    @Override
    public void onSubscribe(Subscription subscription) {
        logger.info("OnSubscribe...");
        this.subscription = subscription;
        subscription.request(5);
    }

    @Override
    public void onNext(Object o) {
        logger.info("onNext -> " + o);
        RxUtils.sleep(100l);
        if (counter.incrementAndGet() % 5 == 0) {
            subscription.request(5);
        }
    }

    @Override
    public void onError(Throwable throwable) {
        logger.info("onError..." + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        logger.info("onComplete...");
    }
}
