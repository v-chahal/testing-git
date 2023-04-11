package com.codingsaint.learning.rxjava.operators.utility;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class TimeStampOperator {
    private static final Logger logger = LoggerFactory.getLogger(TimeStampOperator.class);

    public static void main(String[] args) {
        logger.info("TimeStamp Operator");

        Observable.fromIterable(RxUtils.postiveNumbers(10))
                .timestamp()
                .subscribe(new DemoObserver());
        RxUtils.sleep(5000l);
    }
}
