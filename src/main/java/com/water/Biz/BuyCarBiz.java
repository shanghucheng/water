package com.water.Biz;

import com.water.mapper.BuyCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BuyCarBiz {

    @Autowired
    private BuyCarMapper mapper;

    public List<Map<String,String>> getBuyCar(String id){
        return mapper.getBuyCar(id);
    }

}
