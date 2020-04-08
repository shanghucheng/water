package com.water.biz;

import com.water.entity.Ordersdetail;
import com.water.mapper.OrdersdetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrdersdetailBiz {
    @Autowired
    private OrdersdetailMapper mapper;

    public void insertOrderDetail(String orderid,String waterid,String goodsnum,String goodsprice){
        Ordersdetail ordersdetail = new Ordersdetail();
        ordersdetail.setOrderid(Integer.parseInt(orderid));
        ordersdetail.setWaterid(Integer.parseInt(waterid));
        ordersdetail.setGoodsnum(goodsnum);
        ordersdetail.setGoodsprice(goodsprice);
        mapper.insertOrderDetail(ordersdetail);
    }

    public List<Map<String,String>> getOrderDetailByOrderId(String orderid){
        return mapper.getOrderDetailByOrderId(orderid);
    }

}
