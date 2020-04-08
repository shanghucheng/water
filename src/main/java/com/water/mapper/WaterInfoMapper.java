package com.water.mapper;

import com.water.entity.WaterInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface WaterInfoMapper extends Mapper<WaterInfo> {
    public List<WaterInfo> getWaterByTypeId(@Param("watertype") String watertype);
    public List<WaterInfo> getWaterInfo(@Param("type") String type,@Param("typeId") String typeId);
    public WaterInfo getWaterInfoById(@Param("id") String id);
    public void updateStockAndSalesvolume(@Param("id") String id,@Param("stock") String stock,@Param("salesvolume") String salesvolume);
    public void updateState(@Param("id") String id,@Param("stock") String stock);
}