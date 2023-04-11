package com.codingsaint.learning.rxjava.operators.utility;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.operators.combining.ZipOperator;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoOperator {
    private static final Logger logger = LoggerFactory.getLogger(DoOperator.class);

    public static void main(String[] args) {
        logger.info("Do Operator");

        Observable.fromIterable(RxUtils.shapes(10))
                .doOnSubscribe(disposable -> {
                    logger.info("Stream is subscribed.");
                })
                .doOnEach(shapeNotification -> {
                    logger.info("current value is ", shapeNotification.getValue());
                })
                .doOnNext(shape -> {
                    logger.info("Shape is ", shape);
                })
                .doOnComplete(() -> {
                    logger.info("Completed");
                }).subscribe(new DemoObserver());
        RxUtils.sleep(5000l);
    }
}
