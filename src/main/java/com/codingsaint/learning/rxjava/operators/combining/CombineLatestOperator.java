package com.codingsaint.learning.rxjava.operators.combining;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class CombineLatestOperator {
    private static final Logger logger = LoggerFactory.getLogger(CombineLatestOperator.class);

    public static void main(String[] args) {
        logger.info("Combine Latest Operator");
        Observable observable1 = Observable.interval(1000, TimeUnit.MILLISECONDS);
        Observable observable2 = Observable.interval(2000, TimeUnit.MILLISECONDS);
        Observable.combineLatest(observable1, observable2, (o1, o2) -> {
                    return "first: " + o1.toString() + " second: " + o2.toString();
                }).take(6)
                .subscribe(new DemoObserver());
        RxUtils.sleep(10000l);
    }
}
