package com.uustocks.mapper;

import com.uustocks.entity.OpAppActive;

public interface OpAppActiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpAppActive record);

    int insertSelective(OpAppActive record);

    OpAppActive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpAppActive record);

    int updateByPrimaryKey(OpAppActive record);
}