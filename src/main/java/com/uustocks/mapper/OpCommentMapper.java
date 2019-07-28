package com.uustocks.mapper;

import com.uustocks.entity.OpComment;

public interface OpCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpComment record);

    int insertSelective(OpComment record);

    OpComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpComment record);

    int updateByPrimaryKey(OpComment record);
}