package com.codingsaint.learning.rxjava.observer;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoObserver implements Observer {
    private static final Logger logger = LoggerFactory.getLogger(DemoObserver.class);

    @Override
    public void onSubscribe(Disposable disposable) {
        logger.info("OnSubscribe...");
    }

    @Override
    public void onNext(Object o) {
        logger.info("onNext -> " + o);
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
