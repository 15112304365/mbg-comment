package com.uustocks.mapper;

import com.uustocks.entity.ProProductDetails;

public interface ProProductDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProProductDetails record);

    int insertSelective(ProProductDetails record);

    ProProductDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProProductDetails record);

    int updateByPrimaryKey(ProProductDetails record);
}