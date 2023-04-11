package com.codingsaint.learning.rxjava.operators.transforming;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ScanOperator {
    private static final Logger logger = LoggerFactory.getLogger(ScanOperator.class);

    public static void main(String[] args) {
        logger.info("Scan Operator");
        List<Integer> positiveIntegers = RxUtils.postiveNumbers(10);
        Observable.fromIterable(positiveIntegers)
                .scan((integer1, integer2) -> {
                    return integer1 + integer2;
                })
                .subscribe(new DemoObserver());
    }
}
