package com.uustocks.mapper;

import com.uustocks.entity.PayRechargeRecord;

public interface PayRechargeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayRechargeRecord record);

    int insertSelective(PayRechargeRecord record);

    PayRechargeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayRechargeRecord record);

    int updateByPrimaryKey(PayRechargeRecord record);
}