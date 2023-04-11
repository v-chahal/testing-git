package com.codingsaint.learning.rxjava.operators.combining;

import com.codingsaint.learning.rxjava.models.Shape;
import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ZipOperator {
    private static final Logger logger = LoggerFactory.getLogger(ZipOperator.class);

    public static void main(String[] args) {
        logger.info("Zip Operator");
        Observable shapes = Observable.fromIterable(RxUtils.shapes(5));
        Observable numbers = Observable.fromIterable(RxUtils.postiveNumbers(5));
        numbers.zipWith(shapes, (o1, o2) -> {
                    return o1.toString()+" : "+o2.toString();
                })
                .subscribe(new DemoObserver());
    }
}
