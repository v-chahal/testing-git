package com.codingsaint.learning.rxjava.operators.utility;

import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllAndContainsOperator {
    private static final Logger logger = LoggerFactory.getLogger(AllAndContainsOperator.class);

    public static void main(String[] args) {
        allOperator();
        containsOperator();
    }

    public static void allOperator() {
        logger.info("All Operator");
        Observable<Integer> positiveNumbers = Observable.fromIterable(RxUtils.postiveNumbers(5));
        positiveNumbers.all(integer -> integer > 5)
                .subscribe(new SingleObserver<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {
                        logger.info("onSubscribe");
                    }

                    @Override
                    public void onSuccess(Boolean aBoolean) {
                        logger.info("Do all of the events that are greater than 5 {}", aBoolean);
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        logger.info("onError : ", throwable.getMessage());
                    }
                });
    }

    public static void containsOperator() {
        logger.info("Contains Operator");
        Observable<Integer> positiveNumbers = Observable.fromIterable(RxUtils.postiveNumbers(5));
        positiveNumbers.contains(5)
                .subscribe(new SingleObserver<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {
                        logger.info("onSubscribe");
                    }

                    @Override
                    public void onSuccess(Boolean aBoolean) {
                        logger.info("Element present {}", aBoolean);
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        logger.info("onError : ", throwable.getMessage());
                    }
                });
    }
}
