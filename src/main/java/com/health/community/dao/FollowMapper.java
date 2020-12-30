package com.health.community.dao;

import com.health.community.domain.Follow;

public interface FollowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Follow record);

    int insertSelective(Follow record);

    Follow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);
}