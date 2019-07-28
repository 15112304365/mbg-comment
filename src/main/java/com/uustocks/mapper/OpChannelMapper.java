package com.uustocks.mapper;

import com.uustocks.entity.OpChannel;

public interface OpChannelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpChannel record);

    int insertSelective(OpChannel record);

    OpChannel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpChannel record);

    int updateByPrimaryKey(OpChannel record);
}