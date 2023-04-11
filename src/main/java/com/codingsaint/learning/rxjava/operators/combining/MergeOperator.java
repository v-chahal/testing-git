package com.codingsaint.learning.rxjava.operators.combining;

import com.codingsaint.learning.rxjava.models.Shape;
import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MergeOperator {
    private static final Logger logger = LoggerFactory.getLogger(MergeOperator.class);

    public static void main(String[] args) {
        logger.info("Merge Operator");
        Observable observable1 = Observable.fromIterable(RxUtils.shapes(5));
        Observable observable2 = Observable.fromIterable(RxUtils.postiveNumbers(5));
        Observable.merge(observable1, observable2)
                .subscribe(new DemoObserver());
        //RxUtils.sleep(10000l);
    }
}
