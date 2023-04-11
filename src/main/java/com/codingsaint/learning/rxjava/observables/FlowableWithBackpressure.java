package com.codingsaint.learning.rxjava.observables;

import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.codingsaint.learning.rxjava.subcriber.DemoSubscriber;

public class FlowableWithBackpressure {
    private static final Logger logger = LoggerFactory.getLogger(FlowableWithBackpressure.class);

    public static void main(String[] args) {
        Flowable<Integer> positiveNumberEvent = Flowable.fromIterable(RxUtils.postiveNumbers(10000))
                .repeat()
                .observeOn(Schedulers.newThread(), false, 5)
                .subscribeOn(Schedulers.newThread())
                .doOnNext(integer -> logger.info("emitting integers -> " + integer));

        positiveNumberEvent.subscribe(new DemoSubscriber());
        RxUtils.sleep(10000L);
    }
}
