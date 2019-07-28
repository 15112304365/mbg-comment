package com.uustocks.mapper;

import com.uustocks.entity.UFavorStock;

public interface UFavorStockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UFavorStock record);

    int insertSelective(UFavorStock record);

    UFavorStock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UFavorStock record);

    int updateByPrimaryKey(UFavorStock record);
}