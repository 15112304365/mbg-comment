package com.uustocks.mapper;

import com.uustocks.entity.OpSmsRecord;

public interface OpSmsRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpSmsRecord record);

    int insertSelective(OpSmsRecord record);

    OpSmsRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpSmsRecord record);

    int updateByPrimaryKey(OpSmsRecord record);
}