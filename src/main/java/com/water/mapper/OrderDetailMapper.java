package com.water.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrderDetailMapper {

    public List<Map<String,String>> getUserOrder(@Param("id") String id);
}