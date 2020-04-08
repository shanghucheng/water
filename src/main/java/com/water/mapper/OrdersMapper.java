package com.water.mapper;

import com.water.entity.Orders;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface OrdersMapper extends Mapper<Orders> {
    public int insertOrder(Orders orders);
    public List<Orders> getOrder(@Param("userid") String userid,@Param("orderstate") String orderstate);
    public Orders getOrderById(@Param("id") String id);
    public List<Map<String,String>> getOrderByState();
    public void updateOrderStateById(@Param("orderstate") String orderstate,@Param("id") String id);
}