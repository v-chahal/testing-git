package com.codingsaint.learning.rxjava.observables;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class ObservableUsingRange {

    private static final Logger logger = LoggerFactory.getLogger(ObservableUsingRange.class);

    public static void main(String[] args) {
        Observable.range(1, 10)
                .subscribe(new DemoObserver());
        RxUtils.sleep(7000l);
    }
}
