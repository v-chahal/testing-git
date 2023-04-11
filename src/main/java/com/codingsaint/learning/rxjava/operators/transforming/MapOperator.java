package com.codingsaint.learning.rxjava.operators.transforming;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapOperator {
    private static final Logger logger = LoggerFactory.getLogger(MapOperator.class);

    public static void main(String[] args) {
        Observable.fromIterable(RxUtils.postiveNumbers(5))
                .map(integer -> {
                    return integer * 2;
                })
                .subscribe(new DemoObserver());
    }
}
