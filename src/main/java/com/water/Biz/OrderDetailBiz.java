package com.water.Biz;

import com.water.mapper.OrderDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderDetailBiz {

    @Autowired
    private OrderDetailMapper mapper;

    public List<Map<String,String>> getUserOrder(String id){
        return mapper.getUserOrder(id);
    }

}
