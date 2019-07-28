package com.uustocks.mapper;

import com.uustocks.entity.UBooking;

public interface UBookingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UBooking record);

    int insertSelective(UBooking record);

    UBooking selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UBooking record);

    int updateByPrimaryKey(UBooking record);
}