package com.water.biz;

import com.water.entity.RiderOrder;
import com.water.mapper.RiderOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class RiderOrderBiz {

    @Autowired
    private RiderOrderMapper mapper;

    public List<Map<String,String>> getRiderOrderAll(String id,String orderstate){
        return mapper.getRiderOrderAll(id,orderstate);
    }

    public void insertRiderOrder(String rigerid,String orderid){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        RiderOrder riderOrder = new RiderOrder();
        riderOrder.setRiderid(Integer.parseInt(rigerid));
        riderOrder.setOrderid(Integer.parseInt(orderid));
        riderOrder.setOrdertime(dateFormat.format(now));
        mapper.insertRiderOrder(riderOrder);
    }

    public List<Map<String,String>> getRiderOrderById(String id,String sign){
        if ("2".equalsIgnoreCase(sign)){
            return mapper.getRiderOrderByIdMonth(id);
        }else {
            return mapper.getRiderOrderByIdWeek(id);
        }
    }


}
