package com.health.community.service;

import com.health.community.domain.Article;

import java.util.List;

public interface TopicService {


    /**
     * 获取全部主题
     */
    List<Article> getAllTopics();

    /**
     * 获取全部主题及用户信息 用于渲染首页
     */
     List<Article> listTopicsAndUsers();

    /**
     * 获取最多评论主题列表
     * @return
     */
    List<Article> listMostCommentsTopics();

    /**
     * 获取全部主题及用户信息 用于渲染板块页面
     */
    List<Article> listTopicsAndUsersOfTab(Integer tabId);

    /**
     * 获取指定ID主题
     */
    Article selectById(Integer id);

    /**
     * 新建主题
     */
    boolean addTopic(Article article);

    /**
     * 点击量加一
     */
    boolean clickAddOne(Integer id);

    /**
     * 获取主题总数
     */
    int getTopicsNum();


}
