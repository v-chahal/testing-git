package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.operators.transforming.ScanOperator;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DistinctOperator {
    private static final Logger logger = LoggerFactory.getLogger(DistinctOperator.class);

    public static void main(String[] args) {
        logger.info("Distinct Operator");
        Observable.just(1,2,3,3,4,5,1,2,6,7)
                .distinct()
                .subscribe(new DemoObserver());
    }
}
