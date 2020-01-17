package com.water.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WaterInfoMapper {
    public List<Map<String,String>> getBaseWaterInfo();
    public List<Map<String,String>> getWaterInfoDetail(@Param("id") String id);
}