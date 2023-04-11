package com.codingsaint.learning.rxjava.observables;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObservableUsingDefer {

    private static final Logger logger = LoggerFactory.getLogger(ObservableUsingDefer.class);

    public static void main(String[] args) {
        Observable<Integer> observableUsingDefer = Observable.defer(() -> {
            return Observable.fromIterable(RxUtils.postiveNumbers(10));
        });
        observableUsingDefer.subscribe(new DemoObserver());
    }
}
