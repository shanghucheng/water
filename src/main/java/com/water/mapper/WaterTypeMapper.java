package com.water.mapper;

import com.water.Vo.WaterTypeVo;
import com.water.entity.WaterType;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface WaterTypeMapper extends Mapper<WaterType> {
    public List<WaterTypeVo> getWaterType();
    public List<WaterType> getWaterTypeId();
    public List<Map<String,String>> getSearchResult(@Param("value") String value);
}