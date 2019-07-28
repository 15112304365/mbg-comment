package me.mizhoux.mapper;

import me.mizhoux.model.UUser;

import java.util.List;

public interface UUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UUser record);

    UUser selectByPrimaryKey(Integer id);

    List<UUser> selectAll();

    int updateByPrimaryKey(UUser record);

}