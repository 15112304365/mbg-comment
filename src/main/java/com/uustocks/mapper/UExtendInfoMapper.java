package com.uustocks.mapper;

import com.uustocks.entity.UExtendInfo;

public interface UExtendInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UExtendInfo record);

    int insertSelective(UExtendInfo record);

    UExtendInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UExtendInfo record);

    int updateByPrimaryKey(UExtendInfo record);
}