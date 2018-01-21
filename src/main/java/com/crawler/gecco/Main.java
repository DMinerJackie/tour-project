package com.crawler.gecco;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.request.HttpGetRequest;


public class Main {

    public static void main(String[] rags) {
        System.out.println("=======start========");
        HttpGetRequest startUrl = new HttpGetRequest("http://news.iresearch.cn/");
        startUrl.setCharset("GBK");
        GeccoEngine.create()
                //Gecco搜索的包路径
                .classpath("com.crawler.gecco")
                //开始抓取的页面地址
                .start(startUrl)
                //开启几个爬虫线程
                .thread(1)
                //单个爬虫每次抓取完一个请求后的间隔时间
                .interval(2000)
                .run();
    }
}
