package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.operators.transforming.ScanOperator;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ElementAtOperator {
    private static final Logger logger = LoggerFactory.getLogger(ElementAtOperator.class);

    public static void main(String[] args) {
        logger.info("Element At Operator");
        List<Integer> positiveIntegers = RxUtils.postiveNumbers(10);
        Observable.fromIterable(positiveIntegers)
                .elementAt(123)
                .subscribe(new MaybeObserver<Integer>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {
                        logger.info("onSubscribe...");
                    }

                    @Override
                    public void onSuccess(Integer integer) {
                        logger.info("onSuccess...");
                        logger.info("integers {}", integer);
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        logger.info("onError...", throwable.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        logger.info("onComplete...");
                    }
                });
    }
}
