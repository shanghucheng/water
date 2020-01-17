package com.water.Biz;

import com.water.entity.WaterInfoImageurl;
import com.water.mapper.WaterInfoImageurlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterInfoImageurlBiz {

    @Autowired
    private WaterInfoImageurlMapper mapper;

    public List<WaterInfoImageurl> getWaterDetailImageUrl(String id){
        return mapper.getWaterDetailImageUrl(id);
    }

}
