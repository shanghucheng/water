package com.water.mapper;

import java.util.List;

import com.water.entity.WaterInfoImageurl;
import org.apache.ibatis.annotations.Param;

public interface WaterInfoImageurlMapper {
    public List<WaterInfoImageurl> getWaterDetailImageUrl(@Param("id") String id);
}