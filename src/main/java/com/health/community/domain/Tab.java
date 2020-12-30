package com.health.community.domain;

import java.util.List;

/**
 * 主题板块实体类
 */
public class Tab extends BaseDomain {
    private Integer id;

    private String tabName;

    private String tabNameEn;

    private List<Article> articles;

    public String getTabNameEn() {
        return tabNameEn;
    }

    public void setTabNameEn(String tabNameEn) {
        this.tabNameEn = tabNameEn;
    }



    public void setTopics(List<Article> articles) {
        this.articles = articles;
    }

    public List<Article> getTopics() {
        return articles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }
}