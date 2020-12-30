package com.health.community.service.impl;

import com.health.community.dao.ArticleMapper;
import com.health.community.domain.Article;
import com.health.community.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    public ArticleMapper topicDao;

    //获取全部主题
    public List<Article> getAllTopics() {
        return topicDao.getAllTopics();
    }

    //获取指定id主题
    public Article selectById(Integer id) {
        Article article =topicDao.selectById(id);
        return article;
    }

    public List<Article> listMostCommentsTopics() {
        return topicDao.listMostCommentsTopics();
    }

    public boolean addTopic(Article article) {
        return topicDao.insert(article)>0;
    }

    public boolean clickAddOne(Integer id) {
        return topicDao.clickAddOne(id)>0;
    }

    public int getTopicsNum() {
        return topicDao.getTopicsNum();
    }

    public List<Article> listTopicsAndUsers() {
        return topicDao.listTopicsAndUsers();
    }

    public List<Article> listTopicsAndUsersOfTab(Integer tabId) {
        return topicDao.listTopicsAndUsersOfTab(tabId);
    }
}
