package com.uustocks.mapper;

import com.uustocks.entity.UToken;

public interface UTokenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UToken record);

    int insertSelective(UToken record);

    UToken selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UToken record);

    int updateByPrimaryKey(UToken record);
}