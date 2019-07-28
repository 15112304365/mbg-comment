package com.uustocks.mapper;

import com.uustocks.entity.UUser;

public interface UUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UUser record);

    int insertSelective(UUser record);

    UUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);
}