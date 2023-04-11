package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.models.Shape;
import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class FilterOperator {
    private static final Logger logger = LoggerFactory.getLogger(FilterOperator.class);

    public static void main(String[] args) {
        logger.info("Filter Operator");
        List<Shape> shapes = RxUtils.shapes(15);
        for(Shape shape : shapes) {
            logger.info("shape -> {}", shape);
        }

        Observable.fromIterable(shapes)
                .filter(shape -> shape.getColor().equalsIgnoreCase("red"))
                .subscribe(new DemoObserver());
        //RxUtils.sleep(50000l);
    }
}
