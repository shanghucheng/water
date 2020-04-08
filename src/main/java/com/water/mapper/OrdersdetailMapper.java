package com.water.mapper;

import com.water.entity.Ordersdetail;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface OrdersdetailMapper extends Mapper<Ordersdetail> {
    public void insertOrderDetail(Ordersdetail ordersdetail);
    public List<Map<String,String>> getOrderDetailByOrderId(@Param("orderid") String orderid);
}