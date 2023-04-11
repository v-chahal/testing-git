package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SkipAndSkipLastOperator {
    private static final Logger logger = LoggerFactory.getLogger(IgnoreElementsOperator.class);

    public static void main(String[] args) {
        skip();
        skipLast();
    }

    public static void skip() {
        logger.info("Skip Operator");
        List<Integer> positiveIntegers = RxUtils.postiveNumbers(10);
        Observable.fromIterable(positiveIntegers)
                .skip(5)
                .subscribe(new DemoObserver());
    }

    public static void skipLast() {
        logger.info("SkipLast Operator");
        List<Integer> positiveIntegers = RxUtils.postiveNumbers(10);
        Observable.fromIterable(positiveIntegers)
                .skipLast(6)
                .subscribe(new DemoObserver());
    }
}
