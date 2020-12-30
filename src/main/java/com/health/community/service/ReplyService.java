package com.health.community.service;

import com.health.community.domain.Reply;

import java.util.List;

public interface ReplyService {

    List<Reply> getRepliesOfTopic(Integer topicId);

    boolean addReply(Reply reply);

    int repliesNum(Integer topicId);
}
