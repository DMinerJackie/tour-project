package com.jackie.asynchronous;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.nio.client.HttpAsyncClient;
import org.apache.http.nio.client.methods.HttpAsyncMethods;
import org.apache.http.nio.protocol.BasicAsyncResponseConsumer;
import org.apache.http.nio.protocol.HttpAsyncRequestProducer;
import org.springframework.util.StopWatch;

import java.util.concurrent.CompletableFuture;

/**
 * Created by jackie on 18/5/6.
 */
public class AsyncTest {
    public static HttpAsyncClient httpAsyncClient;

    public static CompletableFuture<String> getHttpData(String url) {
        CompletableFuture asyncFuture = new CompletableFuture();

        HttpAsyncRequestProducer producer = HttpAsyncMethods.create(new HttpGet(url));
        BasicAsyncResponseConsumer consumer = new BasicAsyncResponseConsumer();

        FutureCallback callBack = new FutureCallback<HttpResponse>() {

            @Override
            public void completed(HttpResponse httpResponse) {
                asyncFuture.complete(httpResponse);
            }

            @Override
            public void failed(Exception e) {
                asyncFuture.completeExceptionally(e);
            }

            @Override
            public void cancelled() {
                asyncFuture.cancel(true);
            }
        };

        httpAsyncClient.execute(producer, consumer, callBack);
        return asyncFuture;
    }

    public static void main(String[] args) throws Exception {
        StopWatch stopWatch = new StopWatch("AsyncTest");
        stopWatch.start("asyncTest.getHttpData");
        CompletableFuture<String> future = AsyncTest.getHttpData("https://www.baidu.com");
        String result = future.get();
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}
