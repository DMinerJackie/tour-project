package com.crawler.gecco;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HrefBean;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * Created by jackie on 18/1/15.
 */
public class Category implements HtmlBean {
    private static final long serialVersionUID = 3018760488621382659L;

    @Text
    @HtmlField(cssPath="dt a")
    private String parentName;

    @HtmlField(cssPath="ul li")
    private List<HrefBean> categorys;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public List<HrefBean> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<HrefBean> categorys) {
        this.categorys = categorys;
    }
}
