package com.water.biz;

import com.water.entity.Orders;
import com.water.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class OrdersBiz {
    @Autowired
    private OrdersMapper mapper;

    public int insertOrder(String userid,String addressid,String totalnum,String totalprice,String orderstate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        Orders orders = new Orders();
        orders.setUserid(Integer.parseInt(userid));
        orders.setAddressid(Integer.parseInt(addressid));
        orders.setTotalnum(totalnum);
        orders.setTotalprice(totalprice);
        orders.setOrderdate(dateFormat.format(now));
        orders.setOrderstate(orderstate);
        mapper.insertOrder(orders);
        return orders.getId();
    }
    public List<Orders> getOrder(String userid, String orderstate){
        if("1".equalsIgnoreCase(orderstate)){
            orderstate="";
        }
        return mapper.getOrder(userid, orderstate);
    }

    public Orders getOrderById(String id){
        return mapper.getOrderById(id);
    }

    public List<Map<String,String>> getOrderByState(){
        return mapper.getOrderByState();
    }

    public void updateOrderStateById(String orderstate,String id){
        mapper.updateOrderStateById(orderstate, id);
    }

    public List<Map<String,String>> getRiderOrderDetailById(String orderid,String riderid){
        return mapper.getRiderOrderDetailById(orderid, riderid);
    }


}
