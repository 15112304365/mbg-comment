package com.uustocks.mapper;

import com.uustocks.entity.UBookingRecord;

public interface UBookingRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UBookingRecord record);

    int insertSelective(UBookingRecord record);

    UBookingRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UBookingRecord record);

    int updateByPrimaryKey(UBookingRecord record);
}