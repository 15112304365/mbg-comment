package com.uustocks.mapper;

import com.uustocks.entity.UInmail;

public interface UInmailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UInmail record);

    int insertSelective(UInmail record);

    UInmail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UInmail record);

    int updateByPrimaryKey(UInmail record);
}