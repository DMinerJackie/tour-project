package com.jackie.asynchronous;

import com.google.common.collect.Maps;
import org.apache.http.protocol.HttpService;
import org.springframework.util.StopWatch;

import java.util.Map;
import java.util.concurrent.*;

/**
 * Created by jackie on 18/5/6.
 */
public class FutureDemo {
    private static final ExecutorService executor = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        withoutFuture();
        withFuture();
    }

    private static void withoutFuture() {
        final RpcService rpcService = new RpcService();
        HttpService httpService = new HttpService();

        StopWatch stopWatch = new StopWatch("FutureStopWatch");
        stopWatch.start("withoutFuture");
        try {
            rpcService.getRpcResult();
            httpService.getHttpResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
    }

    private static void withFuture() {
        final RpcService rpcService = new RpcService();
        HttpService httpService = new HttpService();
        Future<Map<String, String>> mapFuture = null;
        Future<Integer> intFuture = null;

        StopWatch stopWatch = new StopWatch("FutureStopWatch");

        stopWatch.start("withFuture");
        try {
            mapFuture = executor.submit(() -> rpcService.getRpcResult());
            intFuture = executor.submit(() -> httpService.getHttpResult());
            Map<String, String> mapResult = mapFuture.get();
            Integer integerResult = intFuture.get();
        } catch (Exception e) {
            if (mapFuture != null) {
                mapFuture.cancel(true);
            }
            if (intFuture != null) {
                intFuture.cancel(true);
            }
            throw new RuntimeException(e);
        }
        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
    }

    static class RpcService {
        Map<String, String> getRpcResult() throws Exception {
            TimeUnit.MILLISECONDS.sleep(1000);
            return Maps.newHashMap();
        }
    }

    static class HttpService {
        Integer getHttpResult() throws Exception {
            TimeUnit.MILLISECONDS.sleep(2000);
            return Integer.parseInt("1");
        }
    }
}
