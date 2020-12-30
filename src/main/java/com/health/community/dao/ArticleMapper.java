package com.health.community.dao;

import com.health.community.domain.Article;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectById(Integer id);

    List<Article> listTopicsAndUsers();

    List<Article> listTopicsAndUsersOfTab(Integer tabId);

    List<Article>  listMostCommentsTopics();

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> getAllTopics();

    int clickAddOne(Integer id);

    //获取主题总数
    int getTopicsNum();
}