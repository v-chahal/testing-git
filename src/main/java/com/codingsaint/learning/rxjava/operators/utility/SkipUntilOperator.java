package com.codingsaint.learning.rxjava.operators.utility;

import com.codingsaint.learning.rxjava.observables.ObservableUsingInterval;
import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class SkipUntilOperator {

    private static final Logger logger = LoggerFactory.getLogger(ObservableUsingInterval.class);

    public static void main(String[] args) {
        logger.info("SkipUntil Operator");
        Observable single = Observable.interval(1, TimeUnit.SECONDS);
        Observable five = Observable.interval(5, TimeUnit.SECONDS);
        single.skipUntil(five).subscribe(new DemoObserver());
        RxUtils.sleep(5000l);
    }
}
