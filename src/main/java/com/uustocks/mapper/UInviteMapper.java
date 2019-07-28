package com.uustocks.mapper;

import com.uustocks.entity.UInvite;

public interface UInviteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UInvite record);

    int insertSelective(UInvite record);

    UInvite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UInvite record);

    int updateByPrimaryKey(UInvite record);
}