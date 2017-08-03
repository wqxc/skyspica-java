package com.skyspica.User.Vo;

import javax.validation.constraints.NotNull;

/**
 * Created by xiaolei on 17/7/28.
 */
public class SlideVo {
    public String url;
    public String title;
    public String des;


    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setDes(String des) {
        this.des = des;
    }
    public String getDes() {
        return des;
    }


}
