package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TakeAndTakeLastOperator {
    private static final Logger logger = LoggerFactory.getLogger(TakeAndTakeLastOperator.class);

    public static void main(String[] args) {
        take();
        takeLast();
    }

    public static void take() {
        logger.info("Take Operator");
        List<Integer> positiveIntegers = RxUtils.postiveNumbers(10);
        Observable.fromIterable(positiveIntegers)
                .take(3)
                .subscribe(new DemoObserver());
    }

    public static void takeLast() {
        logger.info("TakeLast Operator");
        List<Integer> positiveIntegers = RxUtils.postiveNumbers(10);
        Observable.fromIterable(positiveIntegers)
                .takeLast(4)
                .subscribe(new DemoObserver());
    }
}
