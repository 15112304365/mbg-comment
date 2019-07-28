package com.uustocks.mapper;

import com.uustocks.entity.OpSmsTpl;

public interface OpSmsTplMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpSmsTpl record);

    int insertSelective(OpSmsTpl record);

    OpSmsTpl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpSmsTpl record);

    int updateByPrimaryKey(OpSmsTpl record);
}