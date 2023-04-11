package com.codingsaint.learning.rxjava.operators.transforming;

import com.codingsaint.learning.rxjava.models.Shape;
import com.codingsaint.learning.rxjava.observables.ObservableUsingJust;
import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BufferOperator {
    private static final Logger logger = LoggerFactory.getLogger(BufferOperator.class);

    public static void main(String[] args) {
        Observable.fromIterable(RxUtils.shapes(5))
                .buffer(3)
                .subscribe(new DemoObserver());
    }
}
