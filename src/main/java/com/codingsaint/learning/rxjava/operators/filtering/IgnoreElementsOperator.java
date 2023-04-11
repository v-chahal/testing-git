package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.operators.transforming.ScanOperator;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class IgnoreElementsOperator {
    private static final Logger logger = LoggerFactory.getLogger(IgnoreElementsOperator.class);

    public static void main(String[] args) {
        logger.info("Ignore Elements Operator");
        List<Integer> positiveIntegers = RxUtils.postiveNumbers(10);
        Observable.fromIterable(positiveIntegers)
                .ignoreElements()
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable disposable) {
                        logger.info("onSubscribe...");
                    }

                    @Override
                    public void onComplete() {
                        logger.info("onComplete...");
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        logger.info("onError...", throwable.getMessage());
                    }
                });
    }
}
