package com.codingsaint.learning.rxjava.observables;

import com.codingsaint.learning.rxjava.models.Shape;
import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ObservableUsingJust {
    private static final Logger logger = LoggerFactory.getLogger(ObservableUsingJust.class);

    public static void main(String[] args) {
        Observable.just("a","b","c", "d","e","f","g","h","i","j")
                .subscribe(new DemoObserver());
    }
}
