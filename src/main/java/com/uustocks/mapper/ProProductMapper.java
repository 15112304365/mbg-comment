package com.uustocks.mapper;

import com.uustocks.entity.ProProduct;

public interface ProProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProProduct record);

    int insertSelective(ProProduct record);

    ProProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProProduct record);

    int updateByPrimaryKey(ProProduct record);
}