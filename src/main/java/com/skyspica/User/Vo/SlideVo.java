package com.skyspica.User.Vo;

import javax.validation.constraints.NotNull;

/**
 * Created by xiaolei on 17/7/28.
 */
public class SlideVo {
    public String url;
    public String titles;
    public String description;
    public int id;


    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }
    public String getTitles() {
        return titles;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "UserInfo{" +
                "url='" + url + '\'' +
                ", title='" + titles + '\'' +
                ", id='" + id + '\'' +
                ", desc='" + description + '\'' +
                '}';
    }
}
