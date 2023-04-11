package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.operators.transforming.ScanOperator;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DebounceOperator {
    private static final Logger logger = LoggerFactory.getLogger(DebounceOperator.class);
    private static final List<Character> changeIt = new ArrayList<>();
    public static void main(String[] args) {
        logger.info("Debounce Operator");
        Random random = new Random();
        Observable.interval(2, TimeUnit.SECONDS)
                .map(c-> {
                    changeIt.add((char) (random.nextInt(26)+'a'));
                    return changeIt;
                }).doOnEach(
                        notification -> { logger.info("current value {}", notification.getValue());
                        }
                )
                .debounce(2, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.newThread())
                .subscribe(new DemoObserver());
        RxUtils.sleep(10000l);
    }
}
