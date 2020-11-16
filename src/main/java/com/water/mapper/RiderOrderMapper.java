package com.water.mapper;

import com.water.entity.RiderOrder;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface RiderOrderMapper extends Mapper<RiderOrder> {
    public List<Map<String,String>> getRiderOrderAll(@Param("id") String id,@Param("orderstate") String orderstate);
    public List<Map<String,String>> getRiderOrderByIdMonth(@Param("id") String id);
    public List<Map<String,String>> getRiderOrderByIdWeek(@Param("id") String id);
    public void insertRiderOrder(RiderOrder riderOrder);
}