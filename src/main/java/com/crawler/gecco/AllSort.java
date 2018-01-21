package com.crawler.gecco;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * Created by jackie on 18/1/15.
 */
@Gecco(matchUrl="http://news.iresearch.cn/", pipelines={"consolePipeline", "allSortPipeline"})
public class AllSort implements HtmlBean {
    private static final long serialVersionUID = 665662335318691818L;

    @Request
    private HttpRequest request;

    // 移动互联网
    @HtmlField(cssPath="#tab-list > div:nth-child(1)")
    private List<Category> mobileInternet;

    // 电子商务
    @HtmlField(cssPath="#tab-list > div:nth-child(2)")
    private List<Category> electric;

    // 互联网
    @HtmlField(cssPath="#tab-list > div:nth-child(3)")
    private List<Category> internet;

    // 网络营销
    @HtmlField(cssPath="#tab-list > div:nth-child(4)")
    private List<Category> netMarket;

    // 网络游戏
    @HtmlField(cssPath="#tab-list > div:nth-child(5)")
    private List<Category> netGame;

    public List<Category> getMobileInternet() {
        return mobileInternet;
    }

    public void setMobileInternet(List<Category> mobileInternet) {
        this.mobileInternet = mobileInternet;
    }

    public List<Category> getElectric() {
        return electric;
    }

    public void setElectric(List<Category> electric) {
        this.electric = electric;
    }

    public List<Category> getInternet() {
        return internet;
    }

    public void setInternet(List<Category> internet) {
        this.internet = internet;
    }

    public List<Category> getNetMarket() {
        return netMarket;
    }

    public void setNetMarket(List<Category> netMarket) {
        this.netMarket = netMarket;
    }

    public List<Category> getNetGame() {
        return netGame;
    }

    public void setNetGame(List<Category> netGame) {
        this.netGame = netGame;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }
}
