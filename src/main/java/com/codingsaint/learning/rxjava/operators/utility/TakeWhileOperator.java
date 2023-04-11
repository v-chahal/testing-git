package com.codingsaint.learning.rxjava.operators.utility;

import com.codingsaint.learning.rxjava.observables.ObservableUsingInterval;
import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TakeWhileOperator {
    private static final Logger logger = LoggerFactory.getLogger(ObservableUsingInterval.class);

    public static void main(String[] args) {
        logger.info("TakeWhile Operator");
        Observable<Integer> positiveNumbers = Observable.fromIterable(RxUtils.postiveNumbers(5));
        positiveNumbers.takeWhile(integer -> {
            return integer < 4;
        }).subscribe(new DemoObserver());
        //RxUtils.sleep(10000l);
    }
}
