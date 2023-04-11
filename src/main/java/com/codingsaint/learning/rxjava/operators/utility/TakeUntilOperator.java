package com.codingsaint.learning.rxjava.operators.utility;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class TakeUntilOperator {
    private static final Logger logger = LoggerFactory.getLogger(TakeUntilOperator.class);

    public static void main(String[] args) {
        logger.info("TakeUntil Operator");
        Observable single = Observable.interval(1, TimeUnit.SECONDS);
        Observable five = Observable.interval(5, TimeUnit.SECONDS);
        single.takeUntil(five).subscribe(new DemoObserver());
    }
}
