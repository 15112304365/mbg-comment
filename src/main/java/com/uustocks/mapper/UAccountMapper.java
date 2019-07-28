package com.uustocks.mapper;

import com.uustocks.entity.UAccount;

public interface UAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UAccount record);

    int insertSelective(UAccount record);

    UAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UAccount record);

    int updateByPrimaryKey(UAccount record);
}