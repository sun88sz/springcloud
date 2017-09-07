package com.sun;

import com.netflix.turbine.aggregator.InstanceKey;
import com.netflix.turbine.aggregator.StreamAggregator;
import com.netflix.turbine.internal.JsonUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import rx.Observable;
import rx.Subscriber;
import rx.subjects.PublishSubject;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ObservableTurbineTest {

    public ObservableTurbineTest(PublishSubject<Map<String, Object>> x) {
        this.x = x;
    }
    private PublishSubject<Map<String, Object>> x;

    Logger log = LoggerFactory.getLogger(this.getClass());

    public void a(){
        Observable<Map<String, Object>> publishedStreams = StreamAggregator
                .aggregateGroupedStreams(x.groupBy(
                        data -> InstanceKey.create((String) data.get("instanceId"))))
                .doOnUnsubscribe(() -> log.info("Unsubscribing aggregation."))
                .doOnSubscribe(() -> log.info("Starting aggregation")).flatMap(o -> o)
                .publish().refCount();
        Observable<Map<String, Object>> ping = Observable.timer(1, 10, TimeUnit.SECONDS)
                .map(count -> Collections.singletonMap("type", (Object) "Ping")).publish()
                .refCount();
        Observable<Map<String, Object>> output = Observable.merge(publishedStreams, ping);


        output.doOnUnsubscribe(() -> log.info("Unsubscribing RxNetty server connection"))
                .flatMap(data -> xx(data));
    }


    public Observable<Void> xx(Map<String,Object> data){
        JsonUtility.mapToJson(data);
        return flush();
    }

    @SuppressWarnings("unchecked")
    public Observable<Void> flush() {
       return  Observable.create(subscriber -> subscriber.onCompleted());
    }
}
