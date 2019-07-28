package com.uustocks.mapper;

import com.uustocks.entity.UFundRecord;

public interface UFundRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UFundRecord record);

    int insertSelective(UFundRecord record);

    UFundRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UFundRecord record);

    int updateByPrimaryKey(UFundRecord record);
}