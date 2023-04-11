package com.codingsaint.learning.rxjava.observables;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

public class ObservableUsingCallable {

    private static final Logger logger = LoggerFactory.getLogger(ObservableUsingCallable.class);

    public static String doSomething() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "doSomething";
    }

    public static void main(String[] args) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return doSomething();
            }
        };

        //from Callable
        Observable.fromCallable(callable)
                .subscribe(new DemoObserver());
    }
}
